package com.tilak.leetcode;

public class PalindromeNumber {

	public static int reverseNumber(int number) {
		
		int reverse=0;
		
		while (number !=0 ) {
			reverse = reverse *10;
			
			reverse = reverse + number % 10;
			
			number = number /10;
		}
		
		return reverse;
	}
	
	public static void main(String[] args) {
		int num = 12;
		
		System.out.println("Number : "+num+ " is Palindrome or not = "+ (num == reverseNumber(num)));
		
		
	}
}
