package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sound_effects_machine implements ActionListener {
	  JButton button1 = new JButton();
		    JButton button2 = new JButton();
		    JButton button3 = new JButton();
		    JButton button4 = new JButton();
	public void run() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		    panel.add(button1);
		    panel.add(button2);
		    panel.add(button3);
		    panel.add(button4);
		    button1.setText("Alien Noises");
		    button2.setText("Pump Shotgun");
		    button3.setText("Sawing Wood");
		    button4.setText("Service Bell");
		    button1.addActionListener(this);
		    button2.addActionListener(this);
		    button3.addActionListener(this);
		    button4.addActionListener(this);
		    frame.pack();
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed==button1) {
			playSound("alien-spaceship_daniel_simion.wav");
			System.out.println("Raid Area 51 with me");}
		else if (buttonPressed == button2) {
			playSound("Pump Shotgun-SoundBible.com-1653268682.wav");
			System.out.println("Fortnite Lover");}
		else if (buttonPressed==button3) {
			playSound("sawing-wood-daniel_simon.wav");
			System.out.println("Lumberjack best legendary");}
		else if (buttonPressed==button4) {
			playSound("service-bell_daniel_simion.wav");
			System.out.println("Hotel time");}
		}
	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();

	}
}