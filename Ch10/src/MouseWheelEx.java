import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseWheelEx extends JFrame{
	JLabel label = new JLabel("Love Java");
	public MouseWheelEx() {
		setTitle("MouseWheel Font Size Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLayout(new FlowLayout());
		label.setSize(200,50);
        label.setFont(new Font("Arial",Font.PLAIN,10));
		
		c.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if(n < 0) label.setFont(new Font("Arial", Font.PLAIN, label.getFont().getSize()-5));
				else label.setFont(new Font("Arial", Font.PLAIN, label.getFont().getSize()+5));
			}
		});
		c.add(label);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseWheelEx();
	}

}

