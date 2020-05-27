import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsClipEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsClipEx() {
		setTitle("Clipping Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300,400);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/london.jpg");
		private Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setClip(100,20,150,150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator", 10, 150);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsClipEx();
	}

}
