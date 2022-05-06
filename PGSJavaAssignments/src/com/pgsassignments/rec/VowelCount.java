package com.pgsassignments.rec;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		int count = 0; 
		char c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String input = scanner.nextLine();
		//input.toLowerCase();
		String[] words = input.split(" ");
		
		System.out.println("The word(s) that start with vowels are: ");
		for (int i = 0; i < words.length; i++) {
			for(int j = 0; j < words[i].length(); j++) {
				c = words[i].charAt(j);
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					count++;
			}
			c = words[i].charAt(0);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				System.out.println(words[i]);
		}
		
		System.out.println("There are " + count + " vowels in the entire sentence.");

	}

}
