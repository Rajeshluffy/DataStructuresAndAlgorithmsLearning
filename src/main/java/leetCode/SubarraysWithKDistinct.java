package leetCode;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class SubarraysWithKDistinct {
	/**
	 * A solution to check If Pangram problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/">check If Pangram - LeetCode</a>
	 */
	public int subarraysWithKDistinct(int[] nums, int k) {

		return Math.abs(kDistinct(nums,k)-kDistinct(nums,k-1));

	}

	/*
	 * Edge case if  less than zero retun zero
	 * 
	 * 
	 * add the p2 variable in the map
	 * 		default 0
	 * 		else increase by 1
	 * 
	 * map.size>k // shrink the window
	 * 		get the nums[p1] -->iterate and delete from  the map
	 * 		p1++
	 * 
	 * Calculate count p2-p1+1
	 * increase the p2
	 * 
	 */

	public int kDistinct(int[] nums,int k) {
		if(k<0) {
			// Edge case
			return 0;
		}

		int p1=0,p2=0,count=0;
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		while(p2<nums.length) {
			map.put(nums[p2],map.getOrDefault(nums[p2],0)+1);
			while(map.size()>k) {
				//Shrink the window
				map.put(nums[p1],map.getOrDefault(nums[p1],0)-1);
				if (map.get(nums[p1]) == 0) {
					map.remove(nums[p1]);
				}
				p1++;
			}
			count += (p2-p1+1);
			//Expand the window
			p2++;
		}
		return count;

	}
	@Test
	public void testData1() {
		int[] nums = {1,2,1,2,3};	
		int k =2;
		System.out.println(subarraysWithKDistinct(nums,k));
	}

	@Test
	public void testData2() {
		int[] nums = {1,2,1,3,4};	
		int k =3;
		System.out.println(subarraysWithKDistinct(nums,k));
	}
}
