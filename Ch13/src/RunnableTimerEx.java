import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable{
	private JLabel label;
	
	public TimerRunnable(JLabel label) {
		this.label = label;
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			label.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}



public class RunnableTimerEx extends JFrame{
	public RunnableTimerEx() {
		setTitle("Runnable Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel();
		label.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(label);
		
		TimerRunnable runnable = new TimerRunnable(label);
		Thread th = new Thread(runnable);
		
		setSize(300,200);
		setVisible(true);
		
		th.start();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunnableTimerEx();
	}

}
