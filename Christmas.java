import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Christmas{
	public static void main(String[] args){

		String[] s = {"Merry Christmas!!", 
					"Santa's gift coming your way 🎁🎁", 
					"Did you buy your Santa cap? " , 
					"Have a joyous and fun-filled Christmas !!" , 
					"Do you know how many reindeer pull Santa's sleigh? 🦌🦌" , 
					"Do you know which animals pull Santa's sleigh?" , 
					"Santa said he loves Rudolph the most. Shhh! It's a secret 😉",
					"How's the christmas tree decoration going ? 🎄"};
		
		Color[] colors = {Color.red , Color.decode("#008000")/*green*/ , Color.decode("#ff8800")/*golden*/};
		Random random = new Random();
		
		JFrame f = new JFrame("Christmas message generator ❄️❄️");
		
		JLabel l1 = new JLabel("Christmas message for you : ");
		l1.setBounds(20,20,400,30);
		l1.setFont(new Font("Arial" , Font.PLAIN , 20));

		JLabel l2 = new JLabel("");
		l2.setBounds(20,60,600,40);
		l2.setFont(new Font("default" , Font.ITALIC , 18));

		JButton b1 = new JButton("GENERATE MESSAGE");
		b1.setBounds(200,120,200,40);
		b1.setFocusPainted(false);

		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent b1){
				int n = random.nextInt(s.length);
				int c = random.nextInt(colors.length);
				l2.setText(s[n]);
				l2.setForeground(colors[c]);
			}
		});

		f.add(l1);
		f.add(l2);
		f.add(b1);

		f.setSize(650,250);
		f.setLayout(null);
		f.setVisible(true);
		

	}
}
