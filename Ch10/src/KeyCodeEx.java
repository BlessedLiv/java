import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame{
	private JLabel label = new JLabel();
	public KeyCodeEx() {
		setTitle("KeyCode Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				Container container = (Container)e.getSource();
				label.setText(KeyEvent.getKeyText(e.getKeyCode()));
				
				if(e.getKeyChar() == '%') {
					container.setBackground(Color.YELLOW);
				}else if(e.getKeyCode() == KeyEvent.VK_F1) {
					container.setBackground(Color.GREEN);
				}
			}
		});
		c.add(label);
		setSize(300,200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
	}

}
