package com.pgsassignments.rec;

public class DivisionbyZero {
	
	public static void main(String[] args){
		int a = 5, b = 0, c;
		try { 
			if( b == 0 ) throw new DivideByZeroException("Cannot divide by zero");
			else { c = a/b; System.out.println(c); }
			}
		catch(DivideByZeroException e){ System.out.println(e.getMessage()); }
	}
	

}
