import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneEx extends JFrame{
	public TabbedPaneEx() {
		setTitle("TabPane Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JTabbedPane pane = createTabPane();
		c.add(pane);
		setSize(250,250);
		setVisible(true);
	}
	
	private JTabbedPane createTabPane() {
		
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("tab1", new JLabel(new ImageIcon("images/flower.jpg")));
		pane.addTab("tab2", new JLabel(new ImageIcon("images/flower.jpg")));
		pane.addTab("tab3", new MyPanel());
		return pane;
	}
	
	class MyPanel extends JPanel{
		public MyPanel() {
			this.setBackground(Color.yellow);
		}
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.BLACK);
			g.drawString("tab3 JPanel", 30, 50);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TabbedPaneEx();
	}

}
