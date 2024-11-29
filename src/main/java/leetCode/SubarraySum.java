package leetCode;

import java.util.HashMap;

import org.junit.Test;

public class SubarraySum {
	/**
	 * A solution to the Sub array Sum problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/subarray-sum-equals-k/">Sub array Sum - LeetCode</a>
	 */

	public int subarraySum(int[] nums, int k) {
/*
 * Initialize the hapMap
 * assign the map(0,1)
 * initialize the count and sum variable as 0
 * initialize the for loop 
 * 		iterate till nums.length
 * 			add sum as sum+nums[i]
 * 				if map contains (sum-k)
 * 					increase the count and map (sum-k)
 * 				add the map and increase the counter
 * 		loop ends
 * return the count
 *  
 * 		
 */

		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, 1);
        int count = 0;

		int sum=0 ;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];

			if (map.containsKey(sum-k)) {
                count += map.get(sum - k);

			}
            map.put(sum,map.getOrDefault(sum, 0) + 1);

		}

		return count;

	}
		@Test
	public void data1() {
		int[] arr = {1,1,1};
		int n = 2;
		System.out.println(	subarraySum(arr,n));

	}
	@Test
	public void data2() {
		int[] arr = {1,2,3};
		int n = 3;
		System.out.println(	subarraySum(arr,n));

	}

}
