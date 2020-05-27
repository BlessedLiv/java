import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx1 extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx1() {
		setTitle("Original Image Size");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(400,300);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/london.jpg");
		private Image image = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			g.drawImage(image, 20, 20, this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawImageEx1();
	}

}
