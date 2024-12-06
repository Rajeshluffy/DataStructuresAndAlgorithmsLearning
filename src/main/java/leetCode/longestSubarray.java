package leetCode;

import org.junit.jupiter.api.Test;

/**
 * A solution to the Longest Subarray of 1's After Deleting One Element
 problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/">Longest Subarray of 1's After Deleting One Element
 - LeetCode</a>
 */

public class longestSubarray {
	/*
	 * initiate int var p1 ,p2,goal,length
	 * iterate the p2 till last
	 * 		if nums[p2]==0
	 * 			increase the goal
	 * 		iterate when goal >1 shrink the window goal >1 until <=1
	 * 			if nums[p1]==0
	 * 				goal--
	 * 		p1++		
	 * 
	 * 
	 * 
	 * expand the window till goal <=1
	 * Calculate the index take the max one
	 * p2++
	 * 
	 * 
	 * 
	 * 
	 */
	public int calculateLongestSubarray(int[] nums) {
		int p1=0, p2=0, goal=0;
		int longestSubarrayLength =0;
		while(p2<nums.length) {
			// expand the window
			if( nums[p2]==0) {
				goal++;
			}

			//Shrink the window
			while (goal>1) {
				if( nums[p1]==0) {
					goal--;
				}
				p1++;	

			}
			longestSubarrayLength=Math.max(longestSubarrayLength, p2-p1);

			p2++;
		}
		return longestSubarrayLength;

	}


	@Test
	public void data1() {
		int[] nums = {0,1,1,1,0,1,1,0,1};
		System.out.println(calculateLongestSubarray(nums));
	}


	@Test
	public void data2() {
		int[] nums = {1,1,0,1};
		System.out.println(calculateLongestSubarray(nums));
	}	
	@Test
	public void data3() {
		int[] nums = {1,1,1};
		System.out.println(calculateLongestSubarray(nums));
	}	
}

