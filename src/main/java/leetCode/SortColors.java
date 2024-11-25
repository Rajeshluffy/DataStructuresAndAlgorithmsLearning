package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class SortColors {
	public void sortColors(int[] nums) {
//		2,0,2,1,1,0
		int left=0;
		int right = nums.length-1;
		int mid=0;
		while(mid<=right) {
			if (nums[mid]==0) {
				int temp = nums[left];
				nums[left] = nums[mid];
				nums[mid] = temp;
			
				mid++;left++;
			}else if (nums[mid]==1) {
				mid++;
			} else{

				int temp = nums[mid];
				nums[mid] = nums[right];
				nums[right] = temp;


				right--;
			}
		}
		System.out.println(Arrays.toString(nums));

		//		- left=0, right=nums.length-1, mid=0; (mid, fast pointer, left, right= slow pointer)

		//		-if(nums[mid] == 0){
		//		// code
		//		swap left, mid
		//		increment both mid, left
		//		}else if(nums [mid] == 1){
		//		//mid++
		//
		//		else{
		//		// swap mid and right
		//		// decremt right


	}


	@Test
	public void example1() {
		int[]nums = {2,0,2,1,1,0};
		sortColors(nums);
	}
	@Test
	public void example2() {
		int[]nums = {2,0,1};
		sortColors(nums);
	}
}
