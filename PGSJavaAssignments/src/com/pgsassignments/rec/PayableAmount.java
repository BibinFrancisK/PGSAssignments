package com.pgsassignments.rec;

import java.util.Scanner;

public class PayableAmount {
	
	static float calculatePayableAmount(float invoiceAmount, char customerCode) {
		float payableAmount, tax, discount;
		if(invoiceAmount < 5000) discount = 0;
		else discount = 0.03f * invoiceAmount;
		if(customerCode == 'X' || customerCode == 'P') tax = 0;
		else tax = 0.01f * invoiceAmount;
		payableAmount = invoiceAmount - discount + tax;
		return payableAmount;
	}
	
	public static void main(String[] args) {
		
		float invoiceAmount;
		char customerCode;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the customer code (A -Z): ");
		customerCode = scanner.next().charAt(0);
		System.out.println("Enter the invoice amount: ");
		invoiceAmount = scanner.nextFloat();
		System.out.println("Payable amount: " + calculatePayableAmount(invoiceAmount, customerCode));
	}

}
