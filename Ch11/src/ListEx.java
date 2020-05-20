import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class ListEx extends JFrame{
	private String[] fruits = {"apple", "banana", "kiwi", "mango", 
								"pear", "peach", "berry", "strawberry", "blackberry"};
	private ImageIcon [] images = {new ImageIcon("images/beauty.png"),
								   new ImageIcon("images/button.jpg"),
								   new ImageIcon("images/normalIcon.png")};
	public ListEx() {
		setTitle("List Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
//		JList<ImageIcon> imageList = new JList<ImageIcon>(images);
//		c.add(imageList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(600,800);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();
	}

}
