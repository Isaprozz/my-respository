package javaswing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing1 {

	public static void main(String[] args) {
		
		
		//THE NEXT LINE CREATES THE JLABEL
				JLabel label=new JLabel();
				label.setText("my first label");
				
		
		
		
		
		JFrame frame=new JFrame();
		frame.setName("game development");
		frame.setVisible(true);
		frame.setSize(275,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//NEXT LINE IS TO ADD THE JLABEL TO THE JFRAME
		frame.add(label);
		
		
		
		
		

	}

}
