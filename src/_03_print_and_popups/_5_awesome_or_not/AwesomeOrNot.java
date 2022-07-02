package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
	public static void main(String[] args) {


	// 1. Make a main method that includes everything below

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	int rando = ran.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	System.out.println(rando);
		// 3. Print your variable to the console
	
		// 4. Get the user to enter something that they think is awesome
	String input = JOptionPane.showInputDialog("Enter something that you think is awesome.");				

		// 5. If your variable is  0
	if (rando == 0) {
		JOptionPane.showMessageDialog(null, input + " is awesome.");	
	}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	if (rando == 1) {
		JOptionPane.showMessageDialog(null, input + " is ok.");	
	}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	
	if (rando == 2) {
		JOptionPane.showMessageDialog(null, input + " is boring.");	
	}
	
		// 8. If your variable is  3
	if (rando == 3) {
		JOptionPane.showMessageDialog(null, "Stop living under a rock.");	
	}
	
			// -- invent your own message to give to the user (be nice).
	}

	 
		// TODO Auto-generated method stub
		
	
}
