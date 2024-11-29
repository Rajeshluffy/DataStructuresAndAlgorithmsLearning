package leetCode;

import java.util.HashMap;

import org.junit.Test;
/**
 * A solution to Pivot Index problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/find-pivot-index/">Pivot Index - LeetCode</a>
 */
public class PivotIndex {
	/*
	 * Initialize the hapMap 
	 * Initialize total sum var
	 * add the individual index sum of prefix
	 * 
	 * calculate the left and right sum
	 * validate and return i
	 * 	else
	 * 		return -1
	 * 
	 * 
	 */
	public int pivotIndex(int[] nums) {
		
		
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            prefixSumMap.put(i, totalSum);
        }

        for (int i = 0; i < nums.length; i++) {
            int leftSum = i == 0 ? 0 : prefixSumMap.get(i - 1);
            int rightSum = totalSum - prefixSumMap.get(i);
            
            if (leftSum == rightSum) {
                return i;
            }
        }


		return -1;

	}
	

	@Test
	public void data1() {
		int[] arr = {1,7,3,6,5,6};
		System.out.println(pivotIndex(arr));

	}
	@Test
	public void data2() {
		int[] arr = {1,2,3};

		System.out.println(pivotIndex(arr));

	}
	@Test
	public void data3() {
		int[] arr = {2,1,-1};

		System.out.println(pivotIndex(arr));
	}
}
