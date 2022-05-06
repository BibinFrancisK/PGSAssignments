package com.pgsassignments.rec;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticOrder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = scanner.nextLine();
		char[] charArray = input.toCharArray();
		Arrays.sort(charArray);
		String sortedString = new String(charArray);
		System.out.println("In alphabetical order: " + sortedString);  

	}

}
