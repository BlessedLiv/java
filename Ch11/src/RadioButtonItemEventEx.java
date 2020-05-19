import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioButtonItemEventEx extends JFrame{
	private JRadioButton [] radio = new JRadioButton[3];
	private String[] text = {"apple", "pear", "cherry"};
	private ImageIcon[] image = {
			new ImageIcon("images/beauty.png"),
			new ImageIcon("images/button.jpg"),
			new ImageIcon("images/normalIcon.png")
	};
	private JLabel imageLabel = new JLabel();
	public RadioButtonItemEventEx() {
		setTitle("Radio Button Event Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);

		ButtonGroup g = new ButtonGroup();
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyRItemListener());
		}
		radio[2].setSelected(true);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(300,500);
		setVisible(true);
	}
	
	class MyRItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED) return;
			if(radio[0].isSelected()) imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected()) imageLabel.setIcon(image[1]);
			else imageLabel.setIcon(image[2]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonItemEventEx();
	}

}
