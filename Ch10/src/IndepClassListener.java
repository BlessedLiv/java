import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame{
	public IndepClassListener() {
		setTitle("Action Event Listener Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton button = new JButton("Action");
		button.addActionListener(new MyActionListener());
		c.add(button);
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();
	}

}

class MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("¾×¼Ç");
		}else {
			b.setText("Action");
		}
	}
}
