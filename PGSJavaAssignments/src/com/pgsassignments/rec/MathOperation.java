package com.pgsassignments.rec;

import java.util.Scanner;

public class MathOperation {
	
	static int calculateSum(int[] numbers) {
		int sum = 0;
		for (int i : numbers) sum += i;
		return sum;
		}
	static int calculateAverage(int[] numbers) throws ArithmeticException {
		int sum = calculateSum(numbers);
		if(numbers.length == 0) throw new ArithmeticException();
		else return sum/(numbers.length);
		}


	public static void main(String[] args) {
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);
			try{
				System.out.println("Enter five numbers;");
				for (int i = 0; i < 5 ; i++)
				numbers[i] = Integer.parseInt(scanner.nextLine());
				System.out.print("The array is: [ " );
				for (int j : numbers)
					System.out.print(j + " ");
				System.out.print("]" + "\n");
				
				System.out.println("Sum of the array: " + calculateSum(numbers));
				System.out.println("Average of the array: " + calculateAverage(numbers));
			}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e) { System.out.println("Please enter integer values only"); }
		catch(Exception e) { System.out.println("Oops! An error occured!"); }
		finally { scanner. close(); }

	}

}
