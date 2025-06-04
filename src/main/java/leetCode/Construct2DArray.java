package leetCode;

import java.util.Arrays;
import org.junit.Test;

public class Construct2DArray {
	/**
	 * A solution to the Convert 1D Array Into 2D Array.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/convert-1d-array-into-2d-array/">Convert 1D Array Into 2D Array - LeetCode</a>
	 */
	public int[][] construct2DArray(int[] original, int m, int n) {

		/*
		 * define two dimensional array with respect to m and n
		 * iterate till original array
		 *  map it with 
		 */
		if (original.length != m * n) {
		    return new int[0][];
		}
		
		int[][] rs = new int[m][n];
		for (int i = 0; i < original.length; i++) {
			rs[i / n][i % n] = original[i];
		}
		return rs;
	}
	
	

	@Test
	public void testData1() {
		int[] original = {1,2,3,4};int m = 2, n = 2;
		int[][] construct2dArray = construct2DArray(original, m, n);
		System.out.println(Arrays.deepToString(construct2dArray));
	}

	@Test
	public void testData2() {
		int[] original = {1,2,3};int m = 1, n = 3;
		int[][] construct2dArray = construct2DArray(original, m, n);
		System.out.println(Arrays.deepToString(construct2dArray));
	}

	@Test
	public void testData3() {
		int[] original = {1,2};int m = 2, n = 2;
		int[][] construct2dArray = construct2DArray(original, m, n);
		System.out.println(Arrays.deepToString(construct2dArray));
	}
}
