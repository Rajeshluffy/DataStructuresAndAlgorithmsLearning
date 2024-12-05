package leetCode;

import java.util.HashMap;

import org.junit.Test;
/**
 * A solution to the Max Consecutive Ones III problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/max-consecutive-ones-iii/description/">Max Consecutive Ones III- LeetCode</a>
 */
public class LongestOnes {
	/*
	 * find the first zero starting index and set it as p1 and p2+1 thus thats window
	 * 
	 * 
	 * 
	 */
	
	
	public int longestOnes(int[] nums, int k) {
		int p1=0,p2=0;
		int maxLength=Integer.MIN_VALUE;
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(0, 0);
		while(p2<nums.length) {
				if(nums[p2]==0) {
					map.put(0,map.getOrDefault(0, 0)+1);
				}

				while(map.get(0)==k) {
					maxLength=Math.max(maxLength, p2-p1+1);
					int temp =p2+1;
					if(temp<=nums.length-1) {
						while (nums[temp]!=0  ) {
							
							maxLength=Math.max(maxLength, temp-p1+1);
							temp++;
							if(temp>=nums.length-1) {
								break;
							}
						}

					}else {
						break;
					}
					if(nums[p1]==0) {
						map.put(0,map.getOrDefault(0, 0)-1);
					}else {
						p1++;
						continue;
					}
					p1++;
				}

				p2++;
		}
		return maxLength;
	}
	public int longestOnes_WindowSliding(int[] nums, int k) {
		int p1 = 0, p2 = 0;
	    int maxLength = 0;
	    int zeroCount = 0;

	    while (p2 < nums.length) {
	        // Expand the window by including the current element
	        if (nums[p2] == 0) {
	            zeroCount++;
	        }

	        // Shrink the window if the number of zeros exceeds k
	        while (zeroCount > k) {
	            if (nums[p1] == 0) {
	                zeroCount--;
	            }
	            p1++;
	        }

	        // Update the maximum length of the window
	        maxLength = Math.max(maxLength, p2 - p1 + 1);
	        p2++;
	    }

	    return maxLength;
	}
	@Test
	public void testData1() {
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0}; int k = 2;
		System.out.println(longestOnes(nums, k));
		System.out.println(longestOnes_WindowSliding(nums, k));

	}
		@Test
		public void testData2() {
			int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}; int k =3 ;
			System.out.println(longestOnes(nums, k));
			System.out.println(longestOnes_WindowSliding(nums, k));

		}
}
