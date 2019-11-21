package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog("What 8 letter word can have a letter taken away and it still makes a word. Take another letter away and it still makes a word. Keep on doing that until you have one letter left. What is the word?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one








if (input.equals("starting")) {

JOptionPane.showMessageDialog(null, "Correct the word is starting! starting, staring, string, sting, sing, sin, in, I.  Cool,huh?");
score++;

}
else {


	JOptionPane.showMessageDialog(null, "Wrong the word is starting! starting, staring, string, sting, sing, sin, in, I.  Cool,huh?");
		
	
	
	
	
	
	
	
	
	
	
	
	
}// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles






String dinosuar = JOptionPane.showInputDialog("The more you take, the more you leave behind. What am I?");







if (dinosuar.equals("Footsteps")) {

JOptionPane.showMessageDialog(null, "Correct!");
score++;

}
else {


	JOptionPane.showMessageDialog(null, "Wrong I am Footsteps. ");
		
	
	
	
	
	
	
	
	
	
	
	
	
}




JOptionPane.showMessageDialog(null, "You ended with a score of "+score );





























// 2. Make a pop up to show the score.
		
	}
}

