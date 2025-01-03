package leetCode;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
/**
 * A solution to the K-diff Pairs in an Array problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/k-diff-pairs-in-an-array/">K-diff Pairs in an Array - LeetCode</a>
 */
public class FindPairs {
	/*
	 * add the frequency of the nums array to the map
	 * 
	 * if k==0 check for the duplicate 
	 * 		if entry set value >1
	 * 			increase the counter
	 * else
	 * 	if map contains nums + k
	 * 		increase the count
	 * 
	 * 
	 */
	public int findPairs(int[] nums, int k) {
		if(k<0) return 0;// Edge case
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;

		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int num = entry.getKey();
			if(k==0) {
				if(entry.getValue()>1) {
					count++;
				}
			} else {
				if(map.containsKey(num+k)) {
					count++;
				}
			}

		}

		return count;

	}

	@Test
	public void testData1() {
		int[] nums = {3,1,4,1,5};
		int k =2;
		System.out.println(findPairs(nums,k));
	}
}
