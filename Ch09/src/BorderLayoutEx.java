import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		container.setLayout(new BorderLayout(30,20));
		
		container.add(new JButton("Calculator"), BorderLayout.CENTER);
		container.add(new JButton("add"), BorderLayout.NORTH);
		container.add(new JButton("div"), BorderLayout.EAST);
		container.add(new JButton("sub"), BorderLayout.SOUTH);
		container.add(new JButton("mul"), BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutEx();
	}

}
