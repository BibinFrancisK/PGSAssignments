package com.pgsassignments.rec;

import java.util.Scanner;

public class ReplaceVowels {
	
	public static void main(String[] args) {
		String input;
		char c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		input = scanner.nextLine();
		//input.toLowerCase();
		StringBuilder myString = new StringBuilder(input);
		for(int i = 0; i < myString.length(); i++) {
			c = myString.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				myString.replace(i, i+1, "*");
		}
			
		System.out.println(myString);
	}
}
