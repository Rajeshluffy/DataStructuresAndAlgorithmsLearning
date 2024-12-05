package leetCode;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class BinarySubarraysWithSum {
	public int numSubarraysWithSum(int[] nums, int goal) {


		/*
		 * 
		 * iterate till p1 exhaust
		 * 	iterate till p2 exhaust
		 *		if nums p1 and nums p2 == goal
		 * 			increase the max
		 * 		increase p2
		 * 	increase p1
		 * 	assign p1 value to p2
		 */
		//		HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
		//		prefixSumCount.put(0, 1);
		//
		//		int sum = 0, count = 0;
		//		for (int i = 0; i < nums.length; i++) {
		//
		//			sum += nums[i];
		//			// Check if (sum - S) exists in the map
		//			if (prefixSumCount.containsKey(sum - goal)) {
		//				count += prefixSumCount.get(sum - goal);
		//			}
		//
		//			prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
		//		}
		//
		//		return count;
		//	}


		int p1=0,p2=0,exactSumCounter=0;
		int sum =0 ;
		while(p2<nums.length) {
			sum+=nums[p2];
			// Expand the window 

			while (sum >goal) {
				// Shrink the window size
				sum-=nums[p1];
				p1++;
			}
			//			maxSubArrayCounter += p2-p1 + 1;


			// Count subarrays with the exact sum
			if (sum == goal) {
				exactSumCounter++;
				// Explore smaller windows within the range
				int temp = p1;
				while (temp < p2 && nums[temp] == 0) {
					exactSumCounter++;
					temp++;
				}
			}
			p2++;
		}



		return exactSumCounter;

	}
	

	@Test
	public void testData1() {
		int[] nums = {1,0,1,0,1};	
		int goal =2;
		System.out.println(numSubarraysWithSum(nums,goal));


	}
	@Test
	public void testData2() {
		int[] nums = {0,0,0,0,0};	
		int goal =0;
		System.out.println(numSubarraysWithSum(nums,goal));


	}
}
