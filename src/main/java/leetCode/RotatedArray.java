package leetCode;
import org.junit.jupiter.api.Test;

public class RotatedArray {


	/*
	 * Initialize low and high
	 * 
	 * 
	 * 
	 * iterate till high less than low
	 * 	if mid == target return mid
	 * 
	 * if nums (low) less than mid
	 * 		if nums(low)<=target and target<nums[mid]
	 * 			high=mid-1;
	 * 		else
	 * 			low =mid+1;
	 * else
	 * 		if nums(high)>=target and target >nums[mid]
	 * 			low=mid+1;
	 * 		else
	 * 			high=mid-1;
	 * 
	 * 
	 * return -1 if anything found
	 */

	//Time Complexity: O(logn)  Space Complexity: O(1)
	public int rotateIndex(int[] nums, int target) {

		int low=0,high=nums.length-1;
		while(low<=high) {
			int mid =(low+high)/2 ;
			if(nums[mid]==target) {
				return mid;
			}
			if(nums[low]<=nums[mid]) {
				if(nums[low]<=target&& target<nums[mid]) {
					high=mid-1;
				}else {
					low=mid+1;
				}

			}else if(nums[high]>nums[mid]) {

				if( nums[high]>=target&&  target>nums[mid]) {
					low=mid+1;
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
		System.out.println(rotateIndex(nums,target ));
	}

	@Test
	public void testData2() {
		int[] nums = {4,5,6,7,0,1,2};	
		int target = 3;
		System.out.println(rotateIndex(nums,target ));
	}
	@Test
	public void testData3() {
		int[] nums = {1};	
		int target = 0;
		System.out.println(rotateIndex(nums,target ));
	}
}
