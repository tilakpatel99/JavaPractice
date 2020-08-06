package com.tilak.leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class LongestCommonPrefix {

	public static void main(String[] args) throws Exception {
		String[] strArray = { "flower", "flow", "flute" };
		System.out.println("Prefix is = "+findLongestPrefix(strArray));
		
//		System.out.println("flowsdfjdjd".indexOf("flower"));  o/p -> -1
//		System.out.println("flowjfldjlkfd".indexOf("flowe")); o/p -> -1
//		System.out.println("flowljfldkjl".indexOf("flow"));   o/p ->  1

	}

	private static String findLongestPrefix(String[] strArray) throws Exception {

		if (strArray == null||strArray.length == 0) {
			throw new Exception("Please give the correct strings");
		}
		String prefix = strArray[0];
		
		//start iterating form second element and check if it has prefix
		for (int i=1; i<strArray.length; i++) {
			
			//remove teh prefix result until it finds same prefix with array element  
			while (strArray[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() -1);
				//System.out.println("Prefix ="+prefix);
			}
		}
		
		
		return prefix;
	}

}
