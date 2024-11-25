package leetCode;

import org.junit.Test;
// https://leetcode.com/problems/matrix-diagonal-sum/description/
/**
 * A solution to the Matrix Diagonal Sum problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/matrix-diagonal-sum/description/">Matrix Diagonal Sum - LeetCode</a>
 */

public class DiagonalSum {
	/*
	 * initialize the sum var
find the sum of first row ()
	 */
	public int diagonalSum(int[][] mat) {
		int totalRow =mat.length;
		int totalColumn =mat[0].length;
		int sum=0;
		if (totalRow==totalColumn) {
			// to find the matrix is even number of matrix

			int firstSet =mat[0].length-1;
			for (int i = 0; i <= totalRow/2; i++) {

				//0 0  0 2
				if (i==totalRow/2) {
					if (totalRow % 2!=0) {
						sum +=mat[i][i];
					}
					break;
				}
				sum += mat[i][i] + mat[i][firstSet];
				//2 0  2 2 
				//1
				sum += mat[firstSet][i] + mat[firstSet][firstSet];

				firstSet--;

			}
		}else {
			throw new IllegalArgumentException("matrix invalid");
		}


		return sum;

	}




	@Test
	public void testData1() {
		int [][] mat = {{1,2,3}, {4,5,6},{7,8,9}};
		System.out.println(diagonalSum(mat));

	} 
	@Test
	public void testData2() {
		int [][] mat = {{1,1,1,1}, {1,1,1,1},{1,1,1,1},{1,1,1,1}};
		System.out.println(diagonalSum(mat));

	} 
	
	@Test
	public void testData3() {
		int [][] mat = {{5}};
		System.out.println(diagonalSum(mat));

	} 
	@Test
	public void testData4() {
		int [][] mat = {{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}};
		System.out.println(diagonalSum(mat));

	} 
	
}
