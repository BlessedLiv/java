import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{
	public LabelEx() {
		setTitle("Label Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("I love you");
		
		ImageIcon image = new ImageIcon("images/beauty.png");
		JLabel imageLabel = new JLabel(image);
		
		ImageIcon call = new ImageIcon("images/normalIcon.png");
		JLabel label = new JLabel("If you miss me, please call to me", call, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}
