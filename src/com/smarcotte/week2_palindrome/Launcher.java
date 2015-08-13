package com.smarcotte.week2_palindrome;

import javax.swing.JOptionPane;

public class Launcher {

	public static void main(String[] args) 
	{
		/***********************************************************************
		Program Name: Palindrome.java
		Programmer's Name: Shane Marcotte
		Program Description: This program will input 5 digit number and output 
			if it is a palidrome
		***********************************************************************/ 
		
		// get input
		String input = retrieveInput();
		
		// check to see if it is a palindrome
		boolean result = check( input);
		
		// display result
		display( result) ;
		
		// exit gracefully
		System.exit(0);
	}

	private static void display(boolean result) {
		// display results
		if( result == true )
			JOptionPane.showMessageDialog(null, "You have entered a palindrome!");
			
		else
			JOptionPane.showMessageDialog(null, "You have not entered a palindrome, sorry!");
	}

	private static boolean check(String input) {
		// first position must be the same as the last position, and second position must be the same as the fourth position
		if(input.charAt(0) == input.charAt(4) && input.charAt(1) == input.charAt(3))
			return true;
		else
			return false;
	}

	private static String retrieveInput() {
		// Determine if the input is a five digit palindrome
		String input = "";
		
		do
		{
			// get input
			input = JOptionPane.showInputDialog("Enter a five digit number: ");
			
			// tell user if it is not valid
			if(input.length() !=5)
				JOptionPane.showMessageDialog(null, "Error. Input must be five digits.");
		}
		while(input.length() != 5);
		
		// return validated string
		return input;
		
	}

}
