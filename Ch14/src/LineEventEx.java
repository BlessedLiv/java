import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LineEventEx extends JFrame {
	private Clip clip;
	private String song="audio/애국가1절.wav";
	private JLabel label = new JLabel(song);
	
	public LineEventEx() {
		setTitle("애국가 1절 연주");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.YELLOW);;
		c.add(label);
		setSize(300,150);
		setVisible(true);
		loadAudio(song);
	}
	private void loadAudio(String path) {
		try {
			File audioFile = new File(path);
			final AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			clip = AudioSystem.getClip();
			clip.addLineListener(new LineListener() {
				
				@Override
				public void update(LineEvent event) {
					if(event.getType() == LineEvent.Type.STOP) {
						try {
							getContentPane().setBackground(Color.orange);
							label.setText(song + " was ended");
							audioStream.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			});
			
			clip.open(audioStream);
			clip.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LineEventEx();
	}

}
