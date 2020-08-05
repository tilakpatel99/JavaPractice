package com.tilak.leetcode;

import java.util.HashMap;
import java.util.Map;

/* 13. Roman to Integer
   Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

	Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
	For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
	
	Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
	
	I can be placed before V (5) and X (10) to make 4 and 9. 
	X can be placed before L (50) and C (100) to make 40 and 90. 
	C can be placed before D (500) and M (1000) to make 400 and 900.
	
	Example 1:

		Input: "III"
		Output: 3
*/
public class RomanToInteger {
	
	
	
	public static void main(String[] args) throws Exception {
		
		String romanString = "XI";
		System.out.println("Integer of Roman letter ("+romanString+") = "+findCorrespodingInteger(romanString));
	}

	private static int findCorrespodingInteger(String romanString) throws Exception {
		
		//check for the best case
		if (romanString == null || romanString.length() ==0 ) {
			throw new Exception("Please enter correct roman number");
		}
		
		//store roman letter and its value to Map
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		
		int result =0;
		
		//loop thorugh romanstring until second last char 
		for (int i=0; i< romanString.length() -1; i++) {
			
			//check if the first char is greater than or equal to next char
			if (map.get(romanString.charAt(i)) >= map.get(romanString.charAt(i+1))) {
				
				//if it is greater then add its value to result
				result += map.get(romanString.charAt(i) ); 
			}else {
				
				//if it is small then substract it from result
				result -= map.get(romanString.charAt(i) );
			}
		}
		
		//above loop will just work until second last char
		//because what is it has only one char in string and also for last char in str will alwasys get addition to result
		result += map.get(romanString.charAt(romanString.length()-1) ); 
		
		
		return result;
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
