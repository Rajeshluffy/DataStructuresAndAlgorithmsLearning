package interviewPrepartioncode;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] nums= {1,4,5,7,2,3,6};
		int[] mergeSort = mergeSort(nums);
		System.out.println(Arrays.toString(mergeSort));
	}


	public static int[] mergeSort(int[] nums) {
		helper(nums, 0, nums.length-1); // first recusrive call
		return nums;
	}

	public static void helper(int[]nums,int low,int high) {
		if(low>=high) return;
		int mid=(low+high)/2;
		helper(nums,0,mid);
		helper(nums,mid+1,high);
		merge(nums,low,mid,high);
	}

	public static void merge(int[] nums, int low, int mid, int high) {
		int p1=0,p2=0,index=low;

		int[] left = Arrays.copyOfRange(nums, low, mid + 1);
		int[] right= Arrays.copyOfRange(nums, mid+1, high+1);

		while(p1<left.length && p2<right.length) {
			if(left[p1]<=right[p2]) {
				nums[index++]=left[p1++];
			}else{
				nums[index++]=right[p2++];
			}
			while(p2<right.length) {
				nums[index++]=right[p2++];
			}

		}

	}

}
