package leetCode;

import java.util.HashMap;

import org.junit.Test;

public class MissingNumber {
	public int missingNumber(int[] nums) {
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
	@Test
	public void data1() {
		int[] nums= {3,0,1};
		System.out.println(missingNumber(nums));

	}
}
