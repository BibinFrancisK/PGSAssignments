package com.pgsassignments.rec;

import java.util.Scanner;

public class NumberCheck {

	static boolean palindromeCheck(int number) {
		int lastDigit, revNumber = 0, oriNumber;;
		oriNumber = number;	
		while(number > 0) {
			lastDigit = number%10;
			revNumber = (revNumber*10) + lastDigit;
			number = number/10;			
		}		
		if(oriNumber ==  revNumber) return true;
		return false;
	}

	static boolean perfectNoCheck(int number) {
		int sum = 0;
		for(int i = 1; i < number; i++) {
			if(number % i == 0)
				sum += i;
		}		
		if(sum == number) return true;
		return false;
	}

	static boolean armstrongCheck(int number) {
		
		int oriNumber, lastDigit, sum = 0;
		oriNumber = number;
		while(number > 0) {
			lastDigit = number % 10;
			sum += Math.pow(lastDigit, 3);
			number = number / 10;
		}
		if(oriNumber ==  sum) return true;
		return false;
	}

	static boolean primeCheck(int number) {
		for(int i = 2; i <= Math.sqrt(number); i++)
			if(number % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = scanner.nextInt();
		System.out.println("Is number palindrome?: " + palindromeCheck(number));
		System.out.println("Is number perfect?: " + perfectNoCheck(number));
		System.out.println("Is number Armstrong?: " + armstrongCheck(number));
		System.out.println("Is number prime?: " + primeCheck(number));

	}

}
