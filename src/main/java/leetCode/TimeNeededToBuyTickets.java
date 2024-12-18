package leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class TimeNeededToBuyTickets {
	/**
	 * A solution to  Time Needed to Buy Tickets problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/time-needed-to-buy-tickets/">Time Needed to Buy Tickets - LeetCode</a>
	 *
	 */

	public int timeRequiredToBuy(int[] tickets, int k) {
		/*
		 * initialized queue
		 * 
		 * add the array value in the queue
		 * to return time required declare a variable
		 * 
		 * get the first node of the queue
		 * 		from first node get first the element
		 * 		from first node get second the element
		 * 
		 * increase first element
		 * decrease second element
		 * 
		 * if(second element>0)
		 * 	add it in the queue
		 * 
		 * if first element == and secondElement==0
		 * 	stop the loop
		 * 
		 * return second element
		 * 		
		 * 
		 */

		Queue<int[]> queue=new LinkedList<>();

		for(int i=0;i<tickets.length;i++) {
			queue.offer(new int[] {i,tickets[i]});
		}

		int totalTime=0;
		while(!queue.isEmpty()) {
			int[] person =queue.poll();
			int index = person[0];
			int remainingTickets=person[1];
			remainingTickets--;
			totalTime++;
			if(remainingTickets>0) {
				queue.offer(new int[] {index,remainingTickets} );
			}
			if(index==k && remainingTickets==0) {
				break;
			}
		}
		return totalTime;
	}


	@Test
	public void testData1() {
		int[] tickets1 = {2, 3, 2};
		int k1 = 2;
		System.out.println(timeRequiredToBuy(tickets1, k1)); 
	}


}
