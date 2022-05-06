package com.pgsassignments.rec;

import java.util.Scanner;

public class CelsiusFahrenheitConv {

	public static void main(String[] args) {
		
		double farenheitTemp, celsiusTemp;
		int choice;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Celsius - Farenheit Converter");
		System.out.println("------------------------------");
		System.out.println("Enter your choice: ");
		System.out.println("1. Celsius - Farenheit conversion");
		System.out.println("2. Farenheit - Celsius conversion");
		
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the Celsius temperature: ");
			celsiusTemp = scanner.nextDouble();
			farenheitTemp = (1.8 * celsiusTemp) + 32;
			System.out.println(celsiusTemp + " Celsius is " + farenheitTemp + " Farenheits");
			break;
		case 2:
			System.out.println("Enter the Farenheit temperature: ");
			farenheitTemp = scanner.nextDouble();
			System.out.println(farenheitTemp);
			celsiusTemp = (farenheitTemp - 32) * 0.555555;
			System.out.println(farenheitTemp + " Farenheits is " + celsiusTemp + " Celsius");
			break;
		default:
			System.out.println("Please enter a valid choice");
			
		}
		
		scanner.close();

	}

}
