package leetCode;

import org.junit.Test;

public class SearchMatrix {

	public boolean searchMatrix_(int[][] matrix, int target) {
		/*
		 * check the matrix null and matrix length is zero
		 * 		return false
		 * 
		 * find the total number matrix
		 * find the total number column matrix
		 * 
		 * initialize   low as zero
		 * initialize high as total number row X total number Column -1
		 * 
		 * iterate till low < high
		 * 	find the mid = low + high /2
		 * 	find the mid matrix element
		 * 	row=mid/totalColumn
		 * 	column=mid%totalColumn
		 * 	if matrix[row][column] == target true
		 * 	if matrix[row][column] < target
		 * 		low=mid+1
		 * 	else
		 * 		high=mid-1
		 * 
		 * return false
		 */

		if(matrix.length==0||matrix == null||matrix[0].length==0) {
			return false;
		}

		int totalRow=matrix.length;
		int totalColumn = matrix[0].length;
		int low =0;
		int high= totalRow * totalColumn -1;
		while(low<=high) {
			int mid=(low+high)/2;
			int row = mid/totalColumn;
			int column = mid%totalColumn;
			if(matrix[row][column]==target) {
				return true;

			}else if(matrix[row][column]<target){
				low=mid+1;
			}else {
				high=mid-1;
			}

		}

		// nothing found
		return false;

	}

	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int totalRow=matrix.length;
		int totalColumn = matrix[0].length;

		int currentRow=0;
		int currentColumn=totalColumn-1;
		while(currentRow<totalRow && currentColumn>=0) {
			if(matrix[currentRow][currentColumn]==target) {
				return true;
			} else if(matrix[currentRow][currentColumn]>target) {
				currentColumn--;
			}else {
				currentRow++;
			}
		}


		return false;
	}


	@Test
	public void data1() {
		int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target =3;
		System.out.println(searchMatrix(matrix,target));
		System.out.println(searchMatrix_(matrix,target));

	}

	@Test
	public void data2() {
		int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target =13;
		System.out.println(searchMatrix(matrix,target));
		System.out.println(searchMatrix_(matrix,target));

	}
	@Test
	public void data3() {
		int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target =60;
		System.out.println(searchMatrix(matrix,target));
		System.out.println(searchMatrix_(matrix,target));

	}
}
