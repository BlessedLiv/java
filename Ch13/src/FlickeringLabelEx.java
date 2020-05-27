import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay;
	
	public FlickeringLabel(String text, long delay) {
		super(text); //Label 생성자 호출  // extends JLabel 했으니까!
		this.delay = delay;
		setOpaque(true);
		
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			if(n==0) setBackground(Color.YELLOW);
			else setBackground(Color.GREEN);
			if(n==0) n =1;
			else n = 0;
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			}
		}
		
	}
}
public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		setTitle("Flicking Runnable Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel Flabel = new FlickeringLabel("Flicking", 500);
		JLabel label = new JLabel("No Flicking");
		FlickeringLabel Flabel2 = new FlickeringLabel("Here Flickering", 300);
		
		c.add(Flabel);
		c.add(label);
		c.add(Flabel2);
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlickeringLabelEx();
	}

}
