package leetCode;

import java.util.HashMap;

import org.junit.Test;

public class MissingNumber {
	public int missingNumber1(int[] nums) {
		/*
		 * add the nums in the map
		 * iterate the loop and if the key is not contains return the index
		 * 
		 */
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, true);
		}

		for (int i = 0; i <= nums.length; i++) {
			if (!map.containsKey(i)) {
				return i; // Missing number found
			}
		}

		return -1;
	}
	public int missingNumber(int[] nums) {

		HashMap<Integer, Boolean> numMap = new HashMap<>();


		for (int num : nums) {
			numMap.put(num, true);
		}

		for (int i = 0; i <= nums.length; i++) {
			if (numMap.getOrDefault(i, null) == null) {
				return i;  // return the missing number
			}
		}

		return -1;  // This case should not happen with valid input
	}

	@Test
	public void testData1() {
		// TODO Auto-generated method stub
		int[] nums = {3,0,1};

		int mN = missingNumber(nums);
		System.out.println("Missing number: " + mN); 
	}

	@Test
	public void testData2() {
		// TODO Auto-generated method stub
		int[] nums = {0, 1};
		int mN = missingNumber(nums);
		System.out.println("Missing number: " + mN); 

	}

	@Test
	public void testData3() {
		// TODO Auto-generated method stub
		int[] nums = {9,6,4,2,3,5,7,0,1};
		int mN = missingNumber(nums);
		System.out.println("Missing number: " + mN); 

	}
}
