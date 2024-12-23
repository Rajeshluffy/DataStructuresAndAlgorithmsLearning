package interviewPrepartioncode;

import java.util.PriorityQueue;

import org.junit.Test;

public class KThSmallestNumber {


	public int smalestNumber(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
		for (int i = 0; i < k; i++) {
			pq.add(nums[i]);
		}
		int ans=0;
		for (int i = k; i < nums.length; i++) {
			if(nums[i]<pq.peek()) {
				pq.poll();
				ans=nums[i];
				pq.add(ans);

			}
		}
		return ans;

	}

	@Test
	public void testData1() {
		int[] nums= {3,16,4,8,5,12};
		int k=3;
		System.out.println(smalestNumber(nums,k));

	}
}
