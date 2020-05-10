import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{

	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		Container con = getContentPane();
		con.setLayout(grid);
		
		con.add(new JLabel("Name"));
		con.add(new JTextField(""));
		con.add(new JLabel("ID"));
		con.add(new JTextField(""));
		con.add(new JLabel("Major"));
		con.add(new JTextField(""));
		con.add(new JLabel("Subject"));
		con.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
