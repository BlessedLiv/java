import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThreadEx extends Thread{
	private JLabel timerLabel;
	
	public TimerThreadEx(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				return;
			}
		}
	}
	
}

public class TimerThread extends JFrame{
	public TimerThread() {
		setTitle("Thread Timer Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThreadEx th = new TimerThreadEx(timerLabel);
		setSize(300,170);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		
		new TimerThread();
	}

}
