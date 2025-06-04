package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class SortedSquares {
	/**
	 * A solution to Squares of a Sorted Array problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">Squares of a Sorted Array - LeetCode</a>
	 */
	public int[] sortedSquares(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			nums[i]=nums[i]*nums[i];
		}
		Arrays.sort(nums);
		return nums; 
	}

	@Test
	public void data1() {
		int[] nums = {1,2,3,1};
		int[] sortedSquares = sortedSquares(nums);
		System.out.println(Arrays.toString(sortedSquares));
	}
	
	@Test
	public void data2() {
		int[] nums = {-4,-1,0,3,10};
		int[] sortedSquares = sortedSquares(nums);
		System.out.println(Arrays.toString(sortedSquares));
	}
	
	@Test
	public void data3() {
		int[] nums = {-7,-3,2,3,11};
		int[] sortedSquares = sortedSquares(nums);
		System.out.println(Arrays.toString(sortedSquares));
	}
}
