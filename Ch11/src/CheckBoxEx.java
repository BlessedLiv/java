import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame{
	public CheckBoxEx() {
		setTitle("CheckBox Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon button = new ImageIcon("images/button.jpg");
		ImageIcon checkedButton = new ImageIcon("images/beauty.png");
		
		JCheckBox checkbox = new JCheckBox("button", button);
		checkbox.setSelectedIcon(checkedButton);
		c.add(checkbox);
		
		checkbox.setBorderPainted(true); //checkbox border!
		setSize(300,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEx();
	}

}
