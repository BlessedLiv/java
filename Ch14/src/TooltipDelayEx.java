import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ToolTipManager;

public class TooltipDelayEx extends JFrame{
	public TooltipDelayEx() {
		setTitle("Tooltip Delay Time Control Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel(new ImageIcon("images/flower.jpg"));
		label.setToolTipText("First Image");
		
		JLabel label2 = new JLabel(new ImageIcon("images/flower.jpg"));
		label2.setToolTipText("Second Image");
		
		c.add(label);
		c.add(label2);
		
		ToolTipManager mg = ToolTipManager.sharedInstance();
		mg.setInitialDelay(0);
		mg.setDismissDelay(2000);
		
		setSize(600,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TooltipDelayEx();
	}

}
