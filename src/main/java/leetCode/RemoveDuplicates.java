package leetCode;

import org.junit.Test;

public class RemoveDuplicates {
	/**
	 * A solution to the Remove Duplicates from Sorted Array problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">Remove Duplicates from Sorted Array - LeetCode</a>
	 */
	/*
	 * fast pointer technique
	 * 		check the edge if array is null empty
	 * 
	 * 	Initialize the two pointers variable
	 *		iterate till p2 reaches end
	 *			if nums[p1]!=nums[p2] 
	 *				pointer increase
	 *				assign the nums[p2] into nums[p1]
	 *			else
	 *				increase the pointer p2
	 *
	 *	return the p1+1;
	 * 
	 * 
	 */
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0; // Return 0 for an empty array
		}
		int p1=0,p2=1;
		while(p2<nums.length) {
			if(nums[p1]!=nums[p2]) {
				p1++;
				nums[p1]=nums[p2];
			}
			p2++;
		}
		return p1+1;
	}

	@Test
	public void data1() {
		int[] arr = {1,1,2};
		System.out.println(removeDuplicates(arr));

	}
	@Test
	public void data2() {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));

	}
	@Test
	public void data3() {
		int[] arr = {1,2,3,4,5};
		System.out.println(removeDuplicates(arr));

	}
	@Test
	public void data4() {
		int[] arr = {1,2,3,4};
		System.out.println(removeDuplicates(arr));

	}
}
