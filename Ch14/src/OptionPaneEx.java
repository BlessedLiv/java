import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OptionPaneEx extends JFrame{
	public OptionPaneEx() {
		setTitle("Option Pane Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(500,200);
		c.add(new MyPanel(), BorderLayout.NORTH);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		private JButton inputBtn = new JButton("Input Name");
		private JTextField tf = new JTextField(10);
		private JButton confirmBtn = new JButton("Confirm");
		private JButton messageBtn = new JButton("Message");
		
		public MyPanel() {
			setBackground(Color.LIGHT_GRAY);
			add(inputBtn);
			add(tf);
			add(confirmBtn);
			add(messageBtn);
			
			inputBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("Please type name");
					if(name != null) tf.setText(name);
				}
			});
			
			confirmBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm", JOptionPane.YES_NO_OPTION);
					
					if(result == JOptionPane.CLOSED_OPTION) tf.setText("Just Closed without Selection");
					else if (result == JOptionPane.YES_OPTION) tf.setText("Yes");
					else if (result == JOptionPane.NO_OPTION) tf.setText("No");
				}
			});
			
			messageBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Caution", "Message", JOptionPane.ERROR_MESSAGE);
				}
			});
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OptionPaneEx();
	}

}
