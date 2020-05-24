import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawStringEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawStringEx() {
		setTitle("DrawString ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300,300);
		setVisible(true);
		
	}
	class MyPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawString("Java is interesting", 30, 30);
			g.drawString("How much? as sky and as earth", 60, 60);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawStringEx();
	}

}
