import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyLabel extends JLabel{
	private int barSize = 0; //그려져야하는 바
	private int maxBarSize; //바의 최대크기
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.magenta);
		int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);
		if(width==0) return; //크기가 0이기 떄문에 바를 그릴 필요없음
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized public void fill() {
		if(barSize == maxBarSize) {
			try {
				wait(); //바가 최대이면, ConsumerThread에 의해 바가 줄어들 때 까지 기다린다.
			} catch (InterruptedException e) {return;}
		}
		barSize++;
		repaint();
		notify(); //기다리는 ConsumerThread 스레드 꺠우기
	}
	
	synchronized public void consume() {
		if(barSize ==0) {
			try {
				wait(); //바의 크기가 0이면 바의 크기가 0보다 커질 때까지 대기
			} catch (Exception e) {return;}
		}
		barSize--;
		repaint();
		notify();
	}
}

class ConsumerThread extends Thread{
	private MyLabel bar;
	public ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}
	@Override
	public void run() {
		while(true) {
			try {
				sleep(200);
				bar.consume();
			}catch (InterruptedException e) {
				return;
			}
		}
	}
}
public class TabAndThreadEx extends JFrame{
	private MyLabel bar = new MyLabel(100);
	public TabAndThreadEx(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.orange);
		bar.setOpaque(true);
		bar.setLocation(20,50);
		bar.setSize(300,20);
		c.add(bar);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill();
			}
		});
		
		setSize(350,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus(); //컨텐트 팬에 키 처리권 부여
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TabAndThreadEx("Press whatever keys to fill the bar");
	}	
}
