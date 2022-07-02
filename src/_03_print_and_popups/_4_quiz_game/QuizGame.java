package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
int score = 0;		
		// ASK A QUESTION AND CHECK THE ANSWER	
				// 2.  Ask the user a question 
String input = JOptionPane.showInputDialog("What is 6 times 9?");				
				// 3.  Use an if statement to check if their answer is correct
if (input.equals("54")) {
	score += 1;
		
}
else {
	score -= 1;
}


String input2 = JOptionPane.showInputDialog("Red and blue make? A:Pink B:Purple C:Orange D:Tundra");				
// 3.  Use an if statement to check if their answer is correct
if (input2.equals("B")) {
score += 1;

}
else {
score -= 1;
}
				// 4.  if the user's answer was correct, add one to their score 
JOptionPane.showMessageDialog(null, "Your score is " + score);	
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		// After all the questions have been asked, tell the user their final score 
		
	}

	
		// TODO Auto-generated method stub
		
	}

	
		// TODO Auto-generated method stub
		
	

