package com.tilak.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/*	Leetcode 26. 
	Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
	
	Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
	
	Example 1:
	
	Given nums = [1,1,2],
	
	Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
	
	It doesn't matter what you leave beyond the returned length.
*/
public class RemoveDuplicatesSortedArray {
	public int removeDup (int [] array) {
		
		//this variable will track where we want to store the unique element
		//this variable start with index 1 becuase 0th element will alwasy be unique
		int index =1;
		
		for (int i=0; i<array.length - 1; i++) {
			if (array[i] != array[i+1]) {
				array[index++] = array[i+1];
			}
		}
		return index;
	}
	@Test
	public void test() {
		int [] a1 = {1,1,2,2,3,3,4,4,5,5};
		int [] a2 = {10,20,20};
		int [] a3 = {90,123,123,12,12,4,5,6,7};
		
		Assert.assertEquals(removeDup(a1), 5);
		
		Assert.assertEquals(removeDup(a2), 2);
		
		Assert.assertEquals(removeDup(a3), 7);
		
		
	}

}
