//Q32

package com.pgsassignments.rec;

import java.util.Comparator;

public class CompareStringLengths implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		if(s1.length() > s2.length())
			return 1;
		else if(s1.length() < s2.length())
			return -1;
		else if (s1.length() == s2.length()) {
			int compare = s1.toLowerCase().compareTo(s2.toLowerCase());
            if(compare == 0)
                compare = s1.compareTo(s2);
            return compare;
		}
		else
			return 0;
	}

}
