import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuActionEventEx extends JFrame{
	private JLabel imgLabel = new JLabel();
	public MenuActionEventEx() {
		setTitle("Menu + Action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER); // 이미지 레이블을 콘텐트팬의 중앙에 부착
		setSize(300,300);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = {"Load", "Hide", "ReShow", "Exit" };
		JMenu screenMenu = new JMenu("Screen");
		
		MenuActionListener listener = new MenuActionListener();
		
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		mb.add(screenMenu);
		setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "Load":
				if(imgLabel.getIcon() != null) {
					imgLabel.setVisible(true);
					return; //이미 로딩되었으면 리턴
				}
				imgLabel.setIcon(new ImageIcon("images/flower.jpg"));
				break;
			case "Hide":
				if(imgLabel.getIcon() == null) return; //이미 로딩되었으면 리턴
				imgLabel.setVisible(false);
				break;
			case "ReShow":
				if(imgLabel.getIcon() == null) return; //이미 로딩되었으면 리턴
				imgLabel.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuActionEventEx();
	}

}
