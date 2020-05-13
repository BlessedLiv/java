import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame{
	
	public ClickAndDoubleClickEx() {
		setTitle("Click and Double Click Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				Component com = (Component)e.getSource();
				com.setBackground(new Color(r,g,b));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickAndDoubleClickEx();
	}

}
