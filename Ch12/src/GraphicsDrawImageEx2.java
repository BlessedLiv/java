import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx2 extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx2() {
		setTitle("Same Size with Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300,400);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			ImageIcon icon = new ImageIcon("images/london.jpg");
			Image img = icon.getImage();
			
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawImageEx2();
	}

}
