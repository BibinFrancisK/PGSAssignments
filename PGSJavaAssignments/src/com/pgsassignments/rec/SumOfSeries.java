package com.pgsassignments.rec;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		
		int a, n, j=1;
		float sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of 'a': ");
		a = scanner.nextInt();
		System.out.println("Enter the value of 'n': ");
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sum += a/(j/j+1);
			j+=2;
		}
		
		System.out.println("The sum of the series is: " + sum);
	}

}
