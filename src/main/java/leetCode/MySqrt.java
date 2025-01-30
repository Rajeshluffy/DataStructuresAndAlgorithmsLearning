package leetCode;

import org.junit.jupiter.api.Test;

public class MySqrt {
	/**
	 * A solution to SQRT(X) problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/sqrtx">SQRT(X) - LeetCode</a>
	 */
	
	/*
	 * Use binary search to find the largest integer M

Initialize two pointers, low = 0 and high = x ,RESULT=0.
Calculate the mid-point and check:
If SQ(mid)==X 
 	return mid
If SQ(mid)<x
	RESULT = MID
	move the low pointer+1

else
	move the high pointer-1


RETURN RESULT
	 * 
	 */

	public int mySqrt(int x) {
		if(x==0||x==1) return x;
		int low=0,high=x,result=0;

		while (low <= high) {
			int mid = (high + low) / 2;
			if((long)mid*mid==x) {
				return mid;
			}else if((long)mid*mid<x){
				result=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return result ;
	}
	
	@Test
	public void data1() {
		int nums = 4;
		System.out.println(mySqrt(nums));
	}
	@Test
	public void data2() {
		int nums = 1;
		System.out.println(mySqrt(nums));
	}
	@Test
	public void data3() {
		int nums = 13;
		System.out.println(mySqrt(nums));
	}
	@Test
	public void data4() {
		int nums = 13;
		System.out.println(mySqrt(nums));
	}
}
