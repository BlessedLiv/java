import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolBarEx extends JFrame{
	
	private Container contentPane;
	
	public ToolBarEx() {
		setTitle("ToolBar ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);
	
	}
	
	private void createToolBar() {
		JToolBar toolBar = new JToolBar("Liv Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.add(new JButton("New"));
//		toolBar.add(new JButton(new ImageIcon("images/flower.jpg")));
		
		Image originImg = new ImageIcon("images/flower.jpg").getImage(); 
		Image changedImg= originImg.getScaledInstance(10, 10, Image.SCALE_SMOOTH );
		ImageIcon Icon = new ImageIcon(changedImg);
		toolBar.add(new JButton(Icon));

		toolBar.addSeparator();
//		toolBar.add(new JButton(new ImageIcon("images/flower.jpg")));
		changedImg= originImg.getScaledInstance(10, 10, Image.SCALE_SMOOTH );
		Icon = new ImageIcon(changedImg);
		toolBar.add(new JButton(Icon));
		
		
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C++");
		combo.addItem("C");
		toolBar.add(combo);
		toolBar.setFloatable(true); // 툴바 움직일 수 있나 없나 true false
		contentPane.add(toolBar, BorderLayout.NORTH);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToolBarEx();
	}

}
