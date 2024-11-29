package leetCode;


import org.junit.Test;

/**
* A solution to the Trapping Water problem.
* 
* @author rajesh
* @see <a href="https://leetcode.com/problems/trapping-rain-water/description/">Trapping Water - LeetCode</a>
*/

public class TrappingWater {
	public int storeWater(int[] nums)  {
		int ans=0;
		int[] leftmaxHeight = new int[nums.length];
		int[]rightMaxHeight=new int[nums.length];
		leftmaxHeight[0]=nums[0];
		rightMaxHeight[rightMaxHeight.length-1]=nums[nums.length-1];

		for (int i = 1; i < nums.length; i++) {
			leftmaxHeight[i]=Math.max(leftmaxHeight[i-1], nums[i]);
		}
		for (int i = rightMaxHeight.length-2;i>=0; i--) {
			rightMaxHeight[i]=Math.max(rightMaxHeight[i+1], nums[i]);

		}

		for (int i = 0; i < nums.length; i++) {
			ans=ans+Math.max(0,Math.min(leftmaxHeight[i],rightMaxHeight[i]-nums[i]));
		}
		return ans;


	}


	@Test
	public void block() {
		int[] heights={0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(storeWater(heights));
	
	}
}
