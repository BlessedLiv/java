import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame{
	private JLabel label = new JLabel("Hello");
	public MouseAdapterEx() {
		setTitle("Mouse Adapter Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
//				super.mousePressed(e);
				int x = e.getX();
				int y = e.getY();
				label.setLocation(x, y);
			}
		});
		label.setSize(50, 30);
		label.setLocation(20, 30);
		c.add(label);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAdapterEx();
	}

}
