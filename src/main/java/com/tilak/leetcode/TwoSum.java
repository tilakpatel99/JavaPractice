package com.tilak.leetcode;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
   Given an array of integers, return indices of the two numbers such that they add up to a specific target.

   You may assume that each input would have exactly one solution, and you may not use the same element twice.

   Example:

   Given nums = [2, 7, 11, 15], target = 9,

   Because nums[0] + nums[1] = 2 + 7 = 9,
   return [0, 1]. 
		   
 */

public class TwoSum {
	
	//using Brute Force approach O(n^2)
	public int[] findTwoSumBruteForce(int[] nums, int target ) {
		
		//Iterate through nums array
		//go to next element and check element is equal to target - previous element then return index
		for (int i=0; i<nums.length; i++) {
			
			for (int j=i+1; j<nums.length; j++) {
				
				if (nums[j] == target - nums[i]) {
					return new int [] {j,i};
				}
			}
		}
		throw new IllegalArgumentException("Now two sum solution");
	}
	
	//using O(n) time and O(n) space complexity appproach
	public int[] twoSumOrder1 (int[] nums, int target) {
		
		//create map to store the number and index of nums array
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//iterte through nums array
		for (int i=0; i<nums.length; i++) {
			
			//fine the reamining number
			int remainingNum  = target - nums[i];
			
			//check if the remaining number is present in Hashmap 
			if (map.containsKey(remainingNum)) {
				
				//If it is present return the both indexes 
				return new int [] { map.get(remainingNum), i};
			}
			map.put(nums[i],i);
		}
		
		//If it will not find the element throw exception with error
		throw new IllegalArgumentException("Now two sum solution");
	}
	
	public static void main(String[] args) {
		
		TwoSum obj1 = new TwoSum();
		
		int [] nums = {3,8,2,16};
		int target = 11;
		
		
		System.out.println("Index of TwoSum = "+Arrays.toString(obj1.findTwoSumBruteForce(nums, target)));
		
		System.out.println("Index of TwoSum = "+Arrays.toString(obj1.findTwoSumBruteForce(nums, target)));
	}
	
	
 
}
