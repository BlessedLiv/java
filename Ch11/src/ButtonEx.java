import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame{
	public ButtonEx() {
		setTitle("Image Button Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		ImageIcon normalIcon = new ImageIcon("images/beauty.png");
		ImageIcon rolloverIcon = new ImageIcon("images/button.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/normalIcon.png");
		
		JButton btn = new JButton(normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		
		c.add(btn);
		setSize(400,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEx();
	}

}
