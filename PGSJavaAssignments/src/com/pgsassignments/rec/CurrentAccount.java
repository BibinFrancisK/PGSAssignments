package com.pgsassignments.rec;

public class CurrentAccount extends Account {
	
	private double overdraftLimit;
	
	public boolean overdraftLimit() {		
		if(overdraftLimit == 10000)
			return true;		
		return false;
	}

}
