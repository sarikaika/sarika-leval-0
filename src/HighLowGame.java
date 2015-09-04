 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		  System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
              String sarika= JOptionPane.showInputDialog("guess a number from 1-100");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int answerNumber=Integer.parseInt(sarika);
			// 5. if the guess is correct
				if (random==answerNumber) {
					JOptionPane.showMessageDialog(null,"you win");
				}
				// 6. win
			// 7. if the guess is high
				if (answerNumber>random) {
					JOptionPane.showMessageDialog(null,"it is too high");
				}
				// 8. tell them it's too high
				
			// 9. if the guess is low
				if (answerNumber<random) {
					JOptionPane.showMessageDialog(null,"it is too low");
				}	
		}	
				}
				// 10. tell them it's too low

		// 12. tell them they lose
	

}


