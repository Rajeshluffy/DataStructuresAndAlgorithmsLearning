package leetCode;

import java.util.HashMap;
import org.junit.Test;

/**
* A solution to the Contains Near by Duplicate problem.
* 
* @author rajesh
* @see <a href="https://leetcode.com/problems/contains-duplicate-ii/description/">Contains Near by Duplicate - LeetCode</a>
*/
public class ContainsNearbyDuplicate {
	//	- Initialize hashmap
	//	- iterate the array and load entries
	//	- before adding check if nums[i] is already there and i-map.get(nums[i])<=k
	//		- if yes return true
	//		- else return false

	public boolean containsNearbyDuplicate(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) { 
				int abs = Math.abs(map.get(nums[i])-i);
				if (abs<=k) {
					return true;
				}

			}
			map.put(nums[i], i);

		}
		/*
		 * 1 0
		 * 2 1
		 * 3 2
		 * 1 3
		 */

		return false;

	}
	@Test
	public void data1() {
		int[] nums = {1,2,3,1};
		int target = 3;
		System.out.println(	containsNearbyDuplicate(nums, target));

	}
	@Test
	public void data2() {
		int[] nums = {1,0,1,1};
		int target = 1;
		System.out.println(	containsNearbyDuplicate(nums, target));
	}
	@Test
	public void data3() {
		int[] nums = {1,2,3,1,2,3};
		int target = 2;
		System.out.println(	containsNearbyDuplicate(nums, target));
	}
}
