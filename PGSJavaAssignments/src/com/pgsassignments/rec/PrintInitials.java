package com.pgsassignments.rec;

import java.util.Scanner;

public class PrintInitials {

	public static void main(String[] args) {
		
		String fullName;
		String[] partsOfName;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		fullName = scanner.nextLine();
		partsOfName = fullName.split(" ");
		System.out.println("Initials: ");
		for(int i = 0; i < partsOfName.length ; i++)
			System.out.print(partsOfName[i].charAt(0) + "." + " ");
	}

}
