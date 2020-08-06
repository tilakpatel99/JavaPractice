package com.tilak.leetcode;

import java.util.Stack;

/*  Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

	An input string is valid if:
	
	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Note that an empty string is also considered valid.
	
	Example 1:
	
	Input: "()"
	Output: true
*/
public class ValidParentheses {

	public static void main(String[] args) {

		String s = "()";
		System.out.println("Give string " + s + " has a vaid parenthesis =" + validParenthesesOrNot(s));
	}

	private static boolean validParenthesesOrNot(String s) {

		
		if (s == null || s.length() == 0) {
			System.out.println("Please pass proper string");
			return false;
		}

		//create stack to store the value 
		Stack<Character> stack = new Stack<Character>();

		for (char c : s.toCharArray()) {
			
			//find if first char is opening bracket and store it in stack
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} 
			//check if we have closing bracket and check if stack is not empty and then pop the stack if it matches with opening bracket
			else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

}
