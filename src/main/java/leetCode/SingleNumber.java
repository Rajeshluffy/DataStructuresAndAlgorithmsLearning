package leetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	/**
	 * A solution to the K-diff Pairs in an Array problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/k-diff-pairs-in-an-array/">K-diff Pairs in an Array - LeetCode</a>
	 */
	/*
	 * add the array to map
	 * 
	 * get the entry of value if ==1
	 * 	return key
	 * 
	 */
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i,0)+1);			
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return -1;
	}

}
