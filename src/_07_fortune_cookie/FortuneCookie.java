package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		  JButton button = new JButton();
		    frame.add(button);
		    frame.pack();
		    button.addActionListener((ActionListener) this);
		    int rand = new Random().nextInt(5);
		    if (rand==1) {
				System.out.println("You will die soon.");
			}else if(rand == 2) {
				System.out.println("You won't have a good day?");
			}else if(rand ==3) {
				System.out.println("You might win the lottery, idk/idc");
			}else if(rand ==4) {
				System.out.println("You are going to be cool today!");
			}else if(rand ==5) {
				System.out.println("You are the stupid!!!");
            System.out.println("Button clicked");}
       }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
	}
	}
