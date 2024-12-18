package leetCode;

import org.junit.Test;

public class FindMin {
	public int findMin(int[] nums) {
		/*
		 *	check whether array is not rotated
		 *	
		 *	iterate till low less than high
		 *	
		 *	If mid element is greater than the last element, the minimum is to the right
		 *
		 *	If mid element is less than the last element, the minimum is to the left or at mid
		 *	
		 *	When duplicates exist, move the high pointer one step closer

		 * 
		 */
		int low=0,high=nums.length-1;

		 while (low < high) {
	            int mid = low + (high - low) / 2;

	            // If mid element is greater than the last element, the minimum is to the right
	            if (nums[mid] > nums[high]) {
	                low = mid + 1;
	            }
	            // If mid element is less than the last element, the minimum is to the left or at mid
	            else if (nums[mid] < nums[high]) {
	                high = mid;
	            }
	            // When duplicates exist, move the high pointer one step closer
	            else {
	                high--; // Safe to decrement as `nums[high] == nums[mid]`
	            }
	        }

	        return nums[low]; // The loop ends when low == high
	}

	@Test
	public void testData1() {
		int[] nums= {3,4,5,1,2};
		System.out.println(findMin(nums));	
	}

	@Test
	public void testData2() {
		int[] nums= {4,5,6,7,0,1,2};
		System.out.println(findMin(nums));	
	}

	@Test
	public void testData3() {
		int[] nums= {11,13,15,17};
		System.out.println(findMin(nums));	

	}
}
