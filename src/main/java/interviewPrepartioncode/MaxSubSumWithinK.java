package interviewPrepartioncode;


import org.junit.Test;

public class MaxSubSumWithinK {

	public int  maxSum(int[] arr, int k) {
		int sum=0;
		int result = Integer.MIN_VALUE;
		int p1=0,p2=0;
		while(p1<arr.length) {
			if(p2>arr.length-1) {
				p2=p1;
				p1++;
			}
			sum+=arr[p2];
			if(sum<=k) {
				result= Math.max(sum,result);
			}else {
				p2=arr.length-1;
			}
			p2++;
		}
		return (result==Integer.MIN_VALUE)?-1:result;
	}

	public int maxSumSlidingWindow(int[] arr, int k) {
		/*
		 * O(n)andO(1)
		 * 
		 * expand the window till prefix sum reaches greater than k
		 * 		if reached shrink the window till prefix sum less than k
		 * 
		 * take the max prefix sum 
		 * 
		 * return max find out or nothing found return -1
		 */
		int p1=0;
		int p2=0;
		int sum=0;
		int result = Integer.MIN_VALUE;


		while(p2<arr.length) {
			sum+=arr[p2];
			while(sum>k) {
				sum-=arr[p1];
				p1++;
			}
			result= Math.max(sum,result);
			p2++;
		}
		return (result==Integer.MIN_VALUE)?-1:result;
	}

	@Test
	public void data1() {
		int[] arr = {34,23,1,24,75,33,54,8};
		int k=60;
		System.out.println(maxSumSlidingWindow(arr,k));
	}

	@Test
	public void data2() {
		int[] arr = {34,23,1,24,75,33,54,8};
		int k=0;
		System.out.println(maxSum(arr,k));
	}

}
