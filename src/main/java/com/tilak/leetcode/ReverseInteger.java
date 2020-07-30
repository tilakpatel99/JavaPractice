package com.tilak.leetcode;

/*
 * Given a 32-bit signed integer, reverse digits of an integer.
   Input: 123
   Output: 321
*/

public class ReverseInteger {
	
	public int reverse(int number) {
		//initilize the temp variable to zero
		int rev=0;
		
		//find the rev number until number gets 0 
		while (number != 0) {
			
			//multiply rev with 10 to get ready to add the last digit of number
			rev = rev *10;
			
			//add the last digit to rev
			rev = rev + number % 10;
			
			//get rid of last added digit
			number = number/10;
		}
        return rev ;
    }
	
	public static void main(String[] args) {
		ReverseInteger obj = new ReverseInteger();
		System.out.println(obj.reverse(123));
	}

}
