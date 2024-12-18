package leetCode;

import org.junit.jupiter.api.Test;

public class Search {
	/**
	 * A solution to  Binary Search problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/binary-search/">Binary Search - LeetCode</a>
	 *
	 */

	/*
	 * - Initialize two pointers low=0, high=nums.length-1, ans-1

- while (low<=high):
- find the mid point
- if (nums[mid]==target) return mid;
- check if the left part of the array (l-m) is sorted
- check if the target is lying between the range
- high=mid-1
- else low=mid+1
- check if the right portion is sorted
- check if the target lies between the range
- low= mid+1
- else high=mid-1

return -1
	 */

	public int search(int[] nums, int target) {

		int low=0,high=nums.length-1;
		while (low<=high) {
			int mid =(low + high) /2;

			if(nums[mid]==target) {
				return mid;
			}
			if(nums[low]<=nums[mid]) {
				if(nums[low]<=target && target <nums[mid]) {
					high=mid-1;
				}else {
					low=mid+1;
				}

			}else if(nums[high]>=nums[mid]) {
				if(nums[mid]<target && target <=nums[high]) {
					low = mid+1;
				}else {
					high=mid-1;
				}

			}

		}
		return -1;
	}


	@Test
	public void testData1() {
		int[] nums = {4,5,6,7,0,1,2};	
		int target = 0;
		System.out.println(search(nums,target ));
	}


	@Test
	public void testData2() {
		int[] nums = {4,5,6,7,0,1,2};	
		int target = 3;
		System.out.println(search(nums,target ));
	}
	@Test
	public void testData3() {
		int[] nums = {1};	
		int target = -1;
		System.out.println(search(nums,target));
	}
	@Test
	public void testData4() {
		int[] nums = {4,5,6,7,0,1,2};	
		int target = 2;
		System.out.println(search(nums,target ));
	}
}
