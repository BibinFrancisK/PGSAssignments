package com.pgsassignments.rec;

public class SavingsAccount extends Account {

	private double  minimumBalance;

	public String withdraw(int withdrawnAmount) {
		if (this.minimumBalance > 1000) {
			balance -= withdrawnAmount;
			return "Amount successfully withdrawn: " + withdrawnAmount
						+ "\nBalance: " + balance;
		}
		return "Your minimum balance is insufficent";
	}

}
