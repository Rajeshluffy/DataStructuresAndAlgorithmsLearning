package leetCode;

import org.junit.jupiter.api.Test;

public class SingleNonDuplicate {
	/**
	 * A solution to the Single Element in a Sorted Array problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/single-element-in-a-sorted-array/">SearchInsert - LeetCode</a>
	 */
	public int singleNonDuplicate(int[] nums) {
		int n= nums.length;
		if(n == 1) return nums[0];
		if(nums[0] != nums[1]) return nums[0];
		if(nums[n-1] != nums[n-2]) return nums[n-1];

		int low=0,high=nums.length-1;
		while(low<=high) {
			int mid = (low+high)/2;

			if(mid%2==0) {

				if(nums[mid+1]==nums[mid]) {
					low=mid+1;

				}else {
					high = mid-1;
				}
			}
			else {
				if(nums[mid-1]==nums[mid]) {
					low=mid+1;
				}else {
					high=mid-1;
				}

			}
		}
		return nums[low];
	}


	@Test
	public void testData1() {
		int[] nums = {1,1,2,3,3,4,4,8,8};	
		System.out.println(singleNonDuplicate(nums));
	}
	@Test
	public void testData2() {
		int[] nums = {3,3,7,7,10,11,11};	
		System.out.println(singleNonDuplicate(nums));
	}
	@Test
	public void testData3() {
		int[] nums = {1,1,2,3,3};	
		System.out.println(singleNonDuplicate(nums));
	}
	@Test
	public void testData4() {
		int[] nums = {1};	
		System.out.println(singleNonDuplicate(nums));
	}
}
