package com.tilak.leetcode;

import java.util.LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tilak.leetcode.LinkList.Node;


/*	Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

	Example:
	
	Input: 1->2->4, 1->3->4
	Output: 1->1->2->3->4->4
*/
public class MergeTwoSortedList {
	
	//given the head of two sorted list
	public LinkList mergeTwoLinkList( Node list1, Node list2) {
		
		//create object to store the merge list
		LinkList mergeList = new LinkList();
		
		//loop until it iterate through one full list
		while (list1  != null && list2 !=null) {
			
			// compare the both list data and store smallest in mergeList
			if (list1.data < list2.data) {
				mergeList.add(list1.data);
				list1 = list1.next;
			}else {
				mergeList.add(list2.data);
				list2 = list2.next;
			}
		}
		
		//finally list1 or list2 will have one data left 
		//and we need to check if its not null then store it in mergelist
		if (list1 != null) {
			mergeList.add(list1.data);
			list1 = list1.next;
		}
		if (list2 != null) {
			mergeList.add(list2.data);
			list2 = list2.next;
		}
		return mergeList;
	}
	
	@Test
	public void test() {
		LinkList list1  = new LinkList();
		LinkList list2  = new LinkList();
		
		list1.add(1);
		list1.add(4);
		list1.add(6);
		
		list2.add(2);
		list2.add(3);
		list2.add(9);
		
		LinkList expectedlist = new LinkList();
		expectedlist.add(1);
		expectedlist.add(2);
		expectedlist.add(3);
		expectedlist.add(4);
		expectedlist.add(6);
		expectedlist.add(9);
		
		
		LinkList codeAnswer = mergeTwoLinkList(list1.head, list2.head);
		
		//Check size of both list
		Assert.assertEquals(codeAnswer.size(), expectedlist.size());
		
		//Check elements are equal or not
		Assert.assertEquals(compare(expectedlist.head, codeAnswer.head), true);
		
		
	}

	private boolean compare(Node expectedlist, Node codeAnswer) {
		
		while (expectedlist != null) {
			if (expectedlist.data != codeAnswer.data) {
				return false;
			}
			expectedlist = expectedlist.next;
			codeAnswer = codeAnswer.next;
		}
		return true;
	}
	
}




