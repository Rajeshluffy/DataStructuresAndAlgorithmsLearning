package leetCode;

import org.junit.Test;
/**
 * A solution to the Minimum Size Subarray Sum problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/minimum-size-subarray-sum/description/">Minimum Size Subarray Sum - LeetCode</a>
 */
public class MinSubArrayLen {
	public int minSubArrayLen(int target, int[] nums) {
		
		int p1 =0;
		int p2 =0,minLength=Integer.MAX_VALUE;
		int sum=0;
		while (p2<nums.length) {
			sum+=nums[p2];
			while (sum>=target) {
				minLength=	Math.min(minLength, p2-p1+1);
				sum-=nums[p1];
			
				p1++;

			}
			p2++;
			
			
		}
		if (minLength==Integer.MAX_VALUE) {
			return 0;
		}
		
		
		return minLength;
// 10000
	}
	@Test
	public void testdata1() {
		int target = 7;int[] nums = {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(target,nums));
	}
	@Test
	public void testdata2() {
		int target = 4;int[] nums = {1,4,4};
		System.out.println(minSubArrayLen(target,nums));
	}
	@Test
	public void testdata3() {
		int target = 11;int[] nums = {1,1,1,1,1,1,1,1};
		System.out.println(minSubArrayLen(target,nums));
	}
}
