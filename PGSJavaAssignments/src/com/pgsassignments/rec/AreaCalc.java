package com.pgsassignments.rec;

import java.util.Scanner;

public class AreaCalc {
	
	static double  area(double radius) {	
		return Math.PI * radius * radius;
				}
	
	static int area (int sideLength) {
		return sideLength * sideLength;
	}
	
	static int area(int length, int breadth) {
		return length * breadth;
	}

	public static void main(String[] args) {
		
		int choice, sideLength, length, breadth; 
		double radius;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice:");
		System.out.println("1. Area of circle");
		System.out.println("2. Area of square");
		System.out.println("3. Area of rectangle");
		
		choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Enter the radius of the circle");
			radius = scanner.nextDouble();
			System.out.println("Area: " + area(radius));
			break;
			
		case 2:
			System.out.println("Enter the side length of the square");
			sideLength = scanner.nextInt();
			System.out.println("Area: " + area(sideLength));
			break;
			
		case 3:
			System.out.println("Enter the length of the rectangle");
			length = scanner.nextInt();
			System.out.println("Enter the breadth of the rectangle");
			breadth = scanner.nextInt();
			System.out.println("Area: " + area(length, breadth));
			break;

		default:
			break;
		}
		
		
		
	}

}
