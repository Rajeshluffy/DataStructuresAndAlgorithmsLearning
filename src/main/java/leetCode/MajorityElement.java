package leetCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

/**
 * A solution to check If Majority Element problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/majority-element/description/">Majority Element - LeetCode</a>
 */

/*
 * Create a map 
 * check the array contain one element
 * 		yes return the first number 
 * iterate and find the individual number occurrence 
 * 	if the element contains in the map
 * 			calculate the occurrence
 * 				if the occurrence is greater the half the array length
 * 					return the 
 * 	else
 * 		add it in the map
 * 
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		if (nums.length==1) {
			return nums[0];
		}
		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				int a=	map.getOrDefault(nums[i], 0)+1;
				map.put(nums[i], a);
				if (a>nums.length/2) {
					return nums[i];
				}

			}	else {
				map.put(nums[i], 1);
			}

		}

		//		int maxValue = Collections.max(map.values());
		//
		//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		//		    if (entry.getValue().equals(maxValue)) {
		//		    	majorityElement = entry.getKey();
		//		        break; 
		//		    }
		//		}

		return -1;
	}



	@Test
	public void data1() {
		int[] input = {2,2};
		System.out.println(majorityElement(input));
	}
	@Test
	public void data2() {
		int[] input = {1};
		System.out.println(majorityElement(input));
	}


	@Test
	public void data3() {
		int[] input = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(input));
	}
	@Test
	public void data4() {
		int[] input = {8,8,7,7,7};
		System.out.println(majorityElement(input));
	}
	@Test
	public void data5() {
		int[] input = {3,2,3};
		System.out.println(majorityElement(input));
	}
}
