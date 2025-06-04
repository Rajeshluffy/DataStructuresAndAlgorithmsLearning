package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class Rotate {
	/**
	 * A solution to the Rotate Array.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/rotate-array/">Rotate Array - LeetCode</a>
	 */

	public void rotate(int[] nums, int k) {
		/*
		 * reverse the array
		 * reverse the element till k
		 * reverse the element from k till last
		 */
		k=k%nums.length;
		reverseMethod(nums, 0, nums.length-1);
		reverseMethod(nums, 0, k-1);
		reverseMethod(nums, k,nums.length-1);
		System.out.print(Arrays.toString(nums));
	}

	public int[] reverseMethod(int[] nums ,int start ,int end) {

		while(start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		return nums;
	}

	@Test
	public void testData1() {
		int[] nums = {1,2,3,4,5,6,7}; int  k = 3;
		rotate(nums,k);	
	}
}
