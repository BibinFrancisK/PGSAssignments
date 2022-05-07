//Q32

package com.pgsassignments.rec;

import java.util.Arrays;

public class UseCompareStringLength {

	public static void main(String[] args) {
		
		String[] myStrings = {"Hello", "How", "Are", "You"};
		System.out.print("Input array: ");
		for (String string : myStrings) {
			System.out.print(string + " ");
		}
		System.out.println();
		Arrays.sort(myStrings, new CompareStringLengths());
		System.out.print("Sorted array: ");
		for (String string : myStrings) {
			System.out.print(string + " ");
		}
	}

}
