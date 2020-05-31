import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame{
	
	public MenuEx() {
		setTitle("Menu Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setSize(250,200);
		setVisible(true);
		
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("Screen");
		
		menu.add(new JMenuItem("Load"));
		menu.add(new JMenuItem("Hide"));
		menu.add(new JMenuItem("Show"));
		menu.addSeparator(); // ºÐ¸®¼± »ðÀÔ
		menu.add(new JMenuItem("Exit"));
		
		bar.add(menu);
		bar.add(new JMenu("Edit"));
		bar.add(new JMenu("Source"));
		bar.add(new JMenu("Project"));
		bar.add(new JMenu("Run"));
		
		setJMenuBar(bar);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEx();
	}

}
