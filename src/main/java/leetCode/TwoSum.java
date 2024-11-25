package leetCode;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class TwoSum {
	
	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !!
	 * 
	 * What is the input(s) type? 
	 * ==>array
	 * What is the expected output? 
	 * ==>array
	 * Do I have constraints to solve the problem? 
	 * 
	 * Do I have all informations to go to next step!! 
//	 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, Edge, Negative
	 * Validate with the interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well? 
	 * 
	 * No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations
	 * (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
	 * 
	 * 7) Start always with Psuedo code // Bruteforce
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !!
	 * 
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

		while (left < right) {
			int temp =numbers[left]+numbers[right]; 
			if (temp==target) {
				return new int[] {left + 1, right + 1}; 
			}else if (temp<target) {
				left++;
			}else {
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
