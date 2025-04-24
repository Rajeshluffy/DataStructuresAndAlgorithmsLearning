package leetCode;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class LongestConsecutive {




	@Test
	public void testData1() {
		int[] nums = {100,4,200,1,3,2};	
		System.out.println(		longestConsecutive(nums));
	}

	public int longestConsecutive(int[] nums) {
		HashSet<Integer> numSet = new HashSet<>();
		int maxLength = Integer.MIN_VALUE;

		for(int temp : nums){
			numSet.add(temp);
		}		

		for (int i = 0; i < nums.length; i++) {
			if(!numSet.contains(nums[i]-1)) {
				int currentValue =nums[i];
				int count =1;
				while(numSet.contains(currentValue+1)) {
					currentValue++;
					count++;
				}
				maxLength=Math.max(maxLength,count);
			}
		}

		return maxLength;


	}




}
