package leetCode;

import org.junit.Test;

public class RemoveDuplicate {
	/**
	 * A solution to the Remove Duplicates from Sorted Array problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/">Remove Duplicates from Sorted Array - LeetCode</a>
	 */
	public int removeDuplicates(int[] nums) {
		int p2=0,p1=0;
		
		while(p2<nums.length) {
			if(p1 < 2 || nums[p2] != nums[p1 - 2]) {
				nums[p1] = nums[p2];
				p1++;
			}
			p2++;
		}

		return p1;
	}

	@Test
	public void data1() {
		int[] nums = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(nums));
	}

	@Test
	public void data2() {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		System.out.println(removeDuplicates(nums));
	}

	@Test
	public void data3() {
		int[] nums = {0,0,1,1,2,3,3};
		System.out.println(removeDuplicates(nums));
	}
}
