import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame{
	public InnerClassListener() {
		setTitle("Action Event Listener Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton button = new JButton("Action");
		button.addActionListener(new MyActionL());
		c.add(button);
		setSize(300,200);
		setVisible(true);
	}
	private class MyActionL implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			if(b.getActionCommand().equals("Action")) {
				b.setText("¾×¼Ç");
			}else {
				b.setText("Action");
			}
			InnerClassListener.this.setTitle(b.getText());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();
	}

}
