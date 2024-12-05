package interviewPrepartioncode;

import org.junit.jupiter.api.Test;

public class MaxSumSubArray {
	public  int getMaxSumSubArr(int[] nums, int k){ 
		int maxSum=0,currSum =0;

		for (int i = 0; i < k; i++) {
			currSum += nums[i];

		}
		maxSum=Math.max(maxSum, currSum);

		for(int i=k;i<nums.length;i++){
			currSum -= nums[i-k];
			currSum+=nums[i];
			maxSum = Math.max(maxSum, currSum);

		}

		return maxSum;
	}
	public  int getMaxSumSubArr_2(int[] nums, int k){ 
		int maxSum=0,currSum =0;

		for (int i = 0; i < k; i++) {
			currSum += nums[i];

		}
		maxSum=Math.max(maxSum, currSum);

		for(int i=1;i<nums.length-k+1;i++){
			currSum -= nums[i-1];
			currSum+=nums[i+k-1];
			maxSum = Math.max(maxSum, currSum);

		}

		return maxSum;
	}


	@Test
	public void testData1() {
		int arr[] = {100, 200, 300, 400};
		int k = 2;
		System.out.println(	getMaxSumSubArr (arr,k));	
		System.out.println(	getMaxSumSubArr_2 (arr,k));				
	}
	@Test
	public void testData2() {
		int arr[] = {100, 200, 300, 400};
		int k = 4;
		System.out.println(	getMaxSumSubArr (arr,k));	
		System.out.println(	getMaxSumSubArr_2 (arr,k));	
		
	}
	@Test
	public void testData3() {
		int arr[] = {100, 200, 300, 400};
		int k = 1;
		System.out.println(	getMaxSumSubArr (arr,k));	
		System.out.println(	getMaxSumSubArr_2 (arr,k));	
	}
}