package leetCode;

import org.junit.jupiter.api.Test;

public class FindPeakElement {
	/**
	 * A solution to check  Find Peak Element problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/find-peak-element/"> Find Peak Element - LeetCode</a>
	 */
	public int findPeakElement(int[] nums) {
		if(nums.length == 1) return 0;

		int low=1,high=nums.length-2;
		while(low<=high) {
			int	mid =(low+high)/2;
			//edge case 1
			if(nums[high]>nums[high-1]) {
				return high;
			}
			//edge case 2
			if(nums[low]>nums[low+1]) {
				return low;
			}

			//Binary search starts
			if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) {
				return mid;

			}else if(nums[mid]<nums[mid-1]) {
				high = mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}

	@Test
	public void testData1() {
		int[] nums = {1,3,5,6};	
		System.out.println(findPeakElement(nums));
	}
	@Test
	public void testData2() {
		int[] nums = {1,2,1,3,5,6,4};	
		System.out.println(findPeakElement(nums));
	}
}
