package leetCode;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class TwoSum {
	/**
	 * A solution to the Two Sum problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/two-sum/description/">Two Sum - LeetCode</a>
	 */
	
	/*
	 * pseudo code:

int[] nums={....}
- Initialise two variables left=0, right=nums.length-1
- while left<right do something
- if (nums[left]+nums[right]==target)
- return new int[]{left, right};
- else if (nums[left]+nums[right]>target)
- right--
else
- left++

	 */
	


    public int[] twoSum(int[] numbers, int target) {
		int left=0;
		int right=numbers.length-1;

		while (left < right) { //(o N)
			int temp =numbers[left]+numbers[right]; 
			if (temp==target) { //o(1)
				return new int[] {left + 1, right + 1}; 
			}else if (temp<target) { //o(1)
				left++;
			}else { //o(1)
				right--;
			}
		}
		
		throw new IllegalArgumentException();
	}


	@Test
	public void dataSet() {
		int [] a = {2,7,11,15};
		int target =9;
		int[] sumOfTwo = twoSum(a,target);
		System.out.println(Arrays.toString(sumOfTwo));
	}
	
	@Test
	public void dataSet1() {
		int [] a = {2,3,4};
		int target =6;
		int[] sumOfTwo = twoSum(a,target);
		System.out.println(Arrays.toString(sumOfTwo));
	}
	
	@Test
	public void dataSet2() {
		int [] a = {-1,0};
		int target =-1;
		int[] sumOfTwo = twoSum(a,target);
		System.out.println(Arrays.toString(sumOfTwo));
	}
	
}
