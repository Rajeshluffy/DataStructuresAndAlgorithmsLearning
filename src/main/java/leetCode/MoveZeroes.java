package leetCode;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class MoveZeroes {
	/**
	 * A solution to the Move Zeroes problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/move-zeroes/description/">Move Zeroes - LeetCode</a>
	 */


	/*pseudo code
	 * 
	 * Initialize two pointer
	 * second pointer less nums.length 
	 *  	check nums second pointer not equal to zero
	 *  		swap and increase pointer
	 *  	if equal
	 *  		increase second pointer
	 *  
	 *  return nums
	 * 
	 */


	public void moveZeroes(int[] nums) {
		int p1=0;
		int p2=0;
		int temp =0;
		while (p2<nums.length) {
			if (nums[p2]!=0) {
				temp = nums[p1];
				nums[p1]=nums[p2];
				nums[p2]=temp;
				p1++;
				p2++;
			}else {
				p2++;
			}
		}
		System.out.println(Arrays.toString(nums));
	}

	@Test
	public void data1() {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}

	@Test
	public void data2() {
		int[] nums = {0};
		moveZeroes(nums);
	}
	@Test
	public void data3() {
		int[] nums = {0,0};
		moveZeroes(nums);
	}
	@Test
	public void data4() {
		int[] nums = {0,-1,1};
		moveZeroes(nums);
	}

}
