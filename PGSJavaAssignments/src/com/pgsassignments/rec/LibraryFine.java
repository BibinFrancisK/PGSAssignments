package com.pgsassignments.rec;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		
		int daysElapsed;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of days elapsed: ");
		daysElapsed = scanner.nextInt();
		
		if(daysElapsed > 0 && daysElapsed <= 5)
			System.out.println("Your fine is " + (daysElapsed*40) +" paise");
		else if(daysElapsed >= 6 && daysElapsed <= 10)
			System.out.println("Your fine is " + (daysElapsed*65) +" paise");
		else if(daysElapsed > 10)
			System.out.println("Your fine is " + (daysElapsed*80) +" paise");
		else
			System.out.println("Oops! I cannot calculate the fine!");
	}

}
