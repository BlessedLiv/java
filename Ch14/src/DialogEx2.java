import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyModalDialog extends JDialog{
	private JTextField tf = new JTextField(10);
	private JButton btn = new JButton("OK");
	public MyModalDialog(JFrame frame, String title) {
		super(frame, title, true); // true 는 모달 타입
		setLayout(new FlowLayout());
		add(tf);
		add(btn);
		setSize(200,100);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
	public String getInput() {
		if(tf.getText().length() == 0) return null;
		else return tf.getText();
	}
}


public class DialogEx2 extends JFrame{
	private MyModalDialog modal;
	public DialogEx2() {
		super("Dialog Ex2 Modal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show modal");
		
		modal = new MyModalDialog(this, "Test Modal Dialog");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				modal.setVisible(true);
				String text = modal.getInput();
				
				if(text == null) return;
				JButton button = (JButton)e.getSource();
				button.setText(text);
				
			}
		});
		
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DialogEx2();
	}

}
