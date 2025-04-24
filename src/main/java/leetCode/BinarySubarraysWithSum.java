package leetCode;


import org.junit.jupiter.api.Test;
/**
 * A solution to check If Pangram problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/binary-subarrays-with-sum/">check If Pangram - LeetCode</a>
 */
public class BinarySubarraysWithSum {


		public int numSubarraysWithSum(int[] nums, int goal) {

			return helperMethood(nums,goal) -helperMethood(nums,goal-1);
		}
		public int helperMethood(int[] nums, int goal) {
			if(goal<0) {
				return 0;

			}
			int p1=0,p2=0,sum=0,count=0;
			while(p2<nums.length) {
				sum += nums[p2];
				//expand the window
				while(sum>goal) {
					//shrink the window
					sum -= nums[p1];
					p1++;
				}
				count += p2-p1+1;
				
				p2++;
			}

			return count;
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
