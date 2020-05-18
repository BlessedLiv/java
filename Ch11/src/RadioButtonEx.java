import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame{
	public RadioButtonEx() {
		setTitle("RadioButton Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon beauty = new ImageIcon("images/beauty.png");
		ImageIcon button = new ImageIcon("images/button.jpg");
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton btn1 = new JRadioButton("Apple");
		JRadioButton btn2 = new JRadioButton("Pear", true);
		JRadioButton btn3 = new JRadioButton("Cherry", beauty);
		btn3.setSelectedIcon(button);
		
		group.add(btn1);group.add(btn2);group.add(btn3);
		c.add(btn1);c.add(btn2);c.add(btn3);
		
		setSize(500,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonEx();
	}

}
