import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable2 implements Runnable{
	private JLabel label;
	public TimerRunnable2(JLabel label) {
		// TODO Auto-generated constructor stub
		this.label = label;
	}
@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=0;
		while(true) {
			label.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exceptio
				return;
			}
		}
	}	
}
public class ThreadInterruptEx extends JFrame{
	private Thread th;
	public ThreadInterruptEx() {
		setTitle("Thread Interrupt Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel();
		label.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable2 runnable = new TimerRunnable2(label);
		th = new Thread(runnable);
		
		c.add(label);
		
		JButton button = new JButton("kill Timer");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				th.interrupt();
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);
			}
		});
		c.add(button);
		
		
		setSize(300,200);
		setVisible(true);
		
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadInterruptEx();
	}	

}
