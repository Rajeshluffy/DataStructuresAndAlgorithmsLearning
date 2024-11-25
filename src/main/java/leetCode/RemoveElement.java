package leetCode;

import org.junit.Test;

public class RemoveElement {


	/*
	 * initialize the left and right variable
	 * initialize the counter variable
	 *  nums[left] and nums [right] both equal increase the counter +2
	 *  nums[left] or nums [right] both equal increase the counter +1
	 * 	increase the pointer by+2	 
	 * 		
	 * 
	 * edge array should always even
	 * and element should presence once
	 * 
	 */



	public int removeElement(int[] nums, int val) {

		int left = 0; 

        // Iterate through the array
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
	}


	@Test
	public void data1() {
		int[] nums = {3,2,2,3};
		int val = 3;

		removeElement(nums, val);
	}

	@Test
	public void data2() {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;

		removeElement(nums, val);
	}

}
