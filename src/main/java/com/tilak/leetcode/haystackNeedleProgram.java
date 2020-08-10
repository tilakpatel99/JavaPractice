package com.tilak.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/*  28. Implement strStr()
  
	 Implement strStr().
	
	Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	
	Example 1:
	
	Input: haystack = "hello", needle = "ll"
	Output: 2
	Example 2:
	
	Input: haystack = "aaaaa", needle = "bba"
	Output: -1
*/
public class haystackNeedleProgram {

	public static int findstrStr(String haystack, String needle) {
		
		//if needle is empty then return 0
		if (needle.isEmpty()) return 0;
		
		/*
		 * iterate the haystack length of haystack.length() - (needle.length()-1)
		 * because hello lenght is 5 and "ll" lenght is 2 so haystack.length() -
		 * (needle.length()-1) = 5-1 = 4 so just itreate haystack four characters means
		 * "hell" no point of checking "o" with "ll"
		 */
		
		for (int i=0; i <haystack.length() - (needle.length()-1); i++) {
			
			//use second loop to check if matches with haystack char
			for (int j=0; j<needle.length(); j++) {

				//check haystack char with needle char if it is not matching then break the loop
				if (haystack.charAt(i+j) != needle.charAt(j)) break;
				
				//check if it was matched and it matched all char of needle then return index of haystack
				if (j+1 == needle.length()) return i;
				
			}
		}
		
		
		return -1;
	}
	
	@Test
	public void test() {
		String s1 = "hello";
		String s2 = "ll";
		
		Assert.assertEquals(findstrStr(s1,s2), 2);
	}

}
