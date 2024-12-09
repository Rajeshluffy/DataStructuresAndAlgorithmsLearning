package leetCode;

import org.junit.jupiter.api.Test;

public class SearchInsert {
	
	/**
	 * A solution to the SearchInsert problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/binary-search/">SearchInsert - LeetCode</a>
	 */
	
	
	/*
	 * loop left<=rigt
	 * 	 mid left+right /2
	 * 
	 * if nums[mid]==target
	 * return mid
	 * 	else if nums[mid]<target
	 * 		left =mid+1;
	 * else 
	 * right =mid-1 
	 * 		
	 */
	
//	1,3,5,6
	
	public int searchInsert(int[] nums, int target) {
		int left=0,right=nums.length-1,ans=nums.length;
		while(left<=right) {
			int mid =(left + right) /2;
			
			if(nums[mid] >= target ) {
//				ans=mid;
				
				right =mid-1;

			}else  {
				left = mid+1;
			}
		}
		return left;
	}
	
	@Test
	public void testData1() {
		int[] nums = {1,3,5,6};	
		int target = 5;
		System.out.println(searchInsert(nums,target ));
	}
	
	
	@Test
	public void testData2() {
		int[] nums = {1,3,5,6};	
		int target = 2;
		System.out.println(searchInsert(nums,target ));
	}
	@Test
	public void testData3() {
		int[] nums = {1,3,5,6};	
		int target = 7;
		System.out.println(searchInsert(nums,target ));
	}
}
