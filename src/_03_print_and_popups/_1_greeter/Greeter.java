package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {

	public Greeter() {
		// TODO Auto-generated constructor stub
		
	}
public static void main(String[] args) {
	System.out.print("Hello World");
	String input = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null,"Hello "+input);
}
}
