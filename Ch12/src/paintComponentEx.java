import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class paintComponentEx extends JFrame{
	public paintComponentEx() {
		setTitle("NEw Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyButton b = new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.cyan);
		c.add(b);
		setSize(250,200);
		setVisible(true);
	}
	class MyButton extends JButton{
		public MyButton(String s) {
			super(s);
		}
		@Override
		public void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new paintComponentEx();
	}

}
