//Q30

package com.pgsassignments.rec;

import java.util.HashSet;
import java.util.Scanner;

public class MyHashSet {
	
	public static void main(String[] args) {
		
		HashSet<String> myHashSet =  new HashSet<String>(5);
		String[] inputArray = new String[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 5 strings:");
		for(int i=0; i<5; i++)
			inputArray[i] =  scanner.nextLine();
		scanner.close();
		for (String string : inputArray) {
			myHashSet.add(string);
		}
		System.out.print("The hash set is: ");
		System.out.println(myHashSet);
			
	}
	
	

}
