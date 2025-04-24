package leetCode;

import org.junit.jupiter.api.Test;

public class GetSum {
	/**
	 * A solution to  Binary Search problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/sum-of-two-integers/">getSum - LeetCode</a>
	 *
	 */


	public int getSum(int a, int b) {   //O(1)
		return Math.addExact(a, b);
	}

	@Test
	public void testData1() {
		int a  =  2;
		int b = 1;
		System.out.println(getSum(a,b ));
	}


}
