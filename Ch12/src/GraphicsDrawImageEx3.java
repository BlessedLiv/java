import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx3 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx3() {
		setTitle("Draw part of image controls");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300,300);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("images/london.jpg");
		Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200, this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawImageEx3();
	}

}
