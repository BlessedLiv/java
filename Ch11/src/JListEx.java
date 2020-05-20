import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

@SuppressWarnings({"rawtypes", "unchecked", "serial"})
public class JListEx extends JFrame{
	private String[] fruits = {"apple", "banana", "kiwi", "mango", 
								"pear", "peach", "berry", "strawberry", "blackberry"};
	private ImageIcon [] images = {new ImageIcon("images/beauty.png"),
								   new ImageIcon("images/button.jpg"),
								   new ImageIcon("images/normalIcon.png")};
	public JListEx() {
		setTitle("List Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList strList = new JList(fruits);
		c.add(strList);
		
		JList imageList = new JList();
		imageList.setListData(images);
		c.add(imageList);
		
		JList scrollList = new JList(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(600,800);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JListEx();
	}
	
}
