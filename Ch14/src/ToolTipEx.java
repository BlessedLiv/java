import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolTipEx extends JFrame{
	private Container contentPane;
	public ToolTipEx() {
		setTitle("Tooltip Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);
	}
	
	
	private void createToolBar() {
		JToolBar bar = new JToolBar("Liv Menu");
		bar.setBackground(Color.LIGHT_GRAY);
		
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("Create File");
		bar.add(newBtn);
		
		Image image = new ImageIcon("images/flower.jpg").getImage();
		Image chimage = image.getScaledInstance(20, 15, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(chimage);
		JButton openBtn = new JButton(icon);
		openBtn.setToolTipText("Open File");
		bar.add(openBtn);
		
		bar.addSeparator();
		
		JButton saveBtn = new JButton("Save");
		saveBtn.setToolTipText("Save Tooltip");
		bar.add(saveBtn);
		
		bar.setFloatable(true); 
		
		JTextField filed = new JTextField("text field");
		filed.setToolTipText("Please type any words");
		bar.add(filed);
		contentPane.add(bar, BorderLayout.NORTH);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToolTipEx();
	}

}
