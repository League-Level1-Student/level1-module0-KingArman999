package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		  JButton duckbutton = new JButton();
		  JButton frogbutton = new JButton();
		  JButton unicornbutton = new JButton();
		  frame.add(panel);
		  frame.setVisible(true);
		    panel.add(duckbutton);
		    panel.add(frogbutton);
		    panel.add(unicornbutton);
		    frame.pack();
		    duckbutton.setText("Click for a duck!");
		    frogbutton.setText("Click for a frog!");
		    unicornbutton.setText("Click for Unicorns!");
		    duckbutton.addActionListener(this);
		    frogbutton.addActionListener(this);
		    unicornbutton.addActionListener(this);
		    
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
e.getSource();
}
}
