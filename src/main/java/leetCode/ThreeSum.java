package leetCode;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class ThreeSum {
	//	i	0		-
	//	j	1		
	//	k	2		
	//	while (iterate i till last index of the array)			
	//	check i+j+k			
	//				
	//	if its equal add it to list			
	//				
	//	if k reaches the end array			
	//		reset to zero		
	//		if k!i		
	//			k++,j++	
	//		k=i		
	//			k++,i++,j++	
	//	else			
	//		if k!i		
	//			k++	j++
	//		k=i		
	//			k+=2	j++
	//				
	//	if j reaches the end array			
	//		reset to zero		
	//		if j!i		
	//			j++	k++
	//		j=i		
	//			k++,i++,j++	
	//	else			
	//		if j!i		
	//			j++	k++
	//		j=i		
	//			j+=2	k++

	//	public List<List<Integer>> threeSum(int[] nums) {
	//
	//		int i =0;
	//		int j=1;
	//		int k =2;
	//
	//		System.out.println("0");
	//		System.out.println(nums.length-1);
	//		while (i < nums.length-1) {
	//			System.out.println(i+" "+j+" "+k);
	//
	//			if (nums[i]+nums[j]+nums[k] ==0) {
	//				//				System.out.println(" ");
	//				//				System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
	//				//				System.out.println("---");
	//			}
	//			//
	//			if (k==nums.length-1) {
	//				k=0;
	//				if(k==i) {
	//					//					k++;
	//					j++;i++;
	//					continue;
	//				}
	//
	//			}else {
	//
	//				if (k!=i||k==0) {
	//					k++;
	//				}
	//				if(k==i){
	//					k++;
	//				}
	//
	//
	//			}
	//			//
	//			if (j>=nums.length-1) {
	//				j=0;
	//
	//				if (j==i) {
	//					k++;
	//					//					j++;
	//					i++;
	//					continue;
	//				}
	//
	//			}else {
	//
	//				if (j!=i||j==0) {
	//					j++;
	//				}
	//				if(j==i){
	//					j++;
	//				}
	//			}
	//
	//
	//
	//
	//		}
	//
	//
	//
	//
	//
	//
	//		return null;
	//
	//	}

	public List<List<Integer>> threeSum(int[] nums) {


		for (int i = 0; i < nums.length - 2; i++) { 
			if(i>0 && nums[i]!=nums[i-1]) {
				continue;
			}

			int l =i+1;
			int r =nums.length-1;
			while (l<r) {
				int s=nums[i]+nums[l]+nums[r];
				if (s==0) {
					System.out.println(nums[i]+" "+nums[l]+" "+nums[r]);

					if (nums[l] == nums[l-1]) {
						l++;
					}	
					if (nums[r] == nums[r+1]) {
						r--;
					}
				}
				else if (s<0) {
					l++;
				}
				else if (s>0) {
					r--;
				}
			}
		}


		return null;

	}

	@Test
	public void data() {
		int[] nums = {-1,0,1,2,-1,-4};
		//		int[] nums = {-1,0,1,-1};

		Arrays.sort(nums);
		threeSum(nums);
	}
}
