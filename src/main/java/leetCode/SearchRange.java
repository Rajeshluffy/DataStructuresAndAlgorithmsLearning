package leetCode;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SearchRange {
	/**
	 * A solution to Find First and Last Position of Element in Sorted Array problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">Find First and Last Position of Element in Sorted Array
 			- LeetCode</a>
	 */
	
	/*
	 * Initialize the variable low,high and bound=-1
	 * 
	 * 		iterate high less than low
	 * 			Initiate mid = low+high /2
	 * 			if nums[mid]==target
	 * 				bound = mid;
	 * 				if finding the first Position true
	 * 					move high index mid -1
	 * 				else
	 * 					move the low index mid+1
	 * 			
	 * 			if(nums[low]<nums[mid])
	 * 				low =mid+1
	 * 			else
	 * 				high=mid-1;
	 * 					
	 * 		return the index
	 * 
	 * 
	 */
		//Time and space complexity O(logn) and O(1)
	public int[] searchRange(int[] nums, int target) {
		
		return  new int[] {elementFinder(nums, target, true),elementFinder(nums, target, false)};
	}
	
	public int elementFinder(int[] nums, int target,boolean isFirst) {
		int low =0,high=nums.length-1;
		int bound=-1;
		while(low<=high) { //O(logn)
			int mid=(low+ high)/2;

			if (nums[mid]==target) {//O(1)
				bound =mid;
				if(isFirst) {
					high = mid - 1;
				}else  {
					low = mid + 1;  
				}
			}else if(nums[low]<nums[mid]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}

		return bound;
	}


	@Test
	public void testData1() {
		int[] nums = {5,7,7,8,8,10};	
		int target = 8;
		int[] searchRange = searchRange(nums,target );
		System.out.println(Arrays.toString(searchRange));
	}
	@Test
	public void testData2() {
		int[] nums = {5,7,7,8,8,10};	
		int target = 6;
		int[] searchRange = searchRange(nums,target );
		System.out.println(Arrays.toString(searchRange));
	}
	@Test
	public void testData3() {
		int[] nums = {};	
		int target = 0;
		int[] searchRange = searchRange(nums,target );
		System.out.println(Arrays.toString(searchRange));
	}
	@Test
	public void testData4() {
		int[] nums = {1};	
		int target = 1;
		int[] searchRange = searchRange(nums,target );
		System.out.println(Arrays.toString(searchRange));
	}

	@Test
	public void testData5() {
		int[] nums = {2,2};	
		int target = 2;
		int[] searchRange = searchRange(nums,target );
		System.out.println(Arrays.toString(searchRange));
	}
	@Test
	public void testData6() {
		int[] nums = {1,3};	
		int target = 1;
		int[] searchRange = searchRange(nums,target );
		System.out.println(Arrays.toString(searchRange));
	}
	@Test
	public void testData7() {
		int[] nums = {1,2,3};	
		int target = 3;
		int[] searchRange = searchRange(nums,target );
		System.out.println(Arrays.toString(searchRange));
	}

}
