import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame{
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = {"Apples", "Pears", "Cherries"};
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx() {
		setTitle("CheckBox & Item Event Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("Apples $1, Pears $5, Cherries $10"));
		
		MyItemListener listener = new MyItemListener();
		
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		sumLabel = new JLabel("Currently $0");
		c.add(sumLabel);
		setSize(250,200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener{
		private int sum = 0;
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0]) {
					sum+=1;
				}else if(e.getItem() == fruits[1]) {
					sum+=5;
				}else {
					sum+=10;
				}
			}else {
				if(e.getItem() == fruits[0]) {
					sum-=1;
				}else if(e.getItem() == fruits[1]) {
					sum-=5;
				}else {
					sum-=10;
				}
			}
			sumLabel.setText("Currently $" + sum );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
