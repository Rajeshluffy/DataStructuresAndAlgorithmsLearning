package interviewPrepartioncode;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class ReverseTheFirstK {

	public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {	

		helper(q,k);

		int s=q.size()-k;
		while(s-->0) {
			int x=q.poll();
			q.add(x);
		}
		return q;
	}
	public void helper(Queue<Integer> q, int k) {
		if(k==0) return;
		Integer poll = q.poll();
		helper(q, k-1);
		q.add(poll);
	}

	@Test
	public void testData1() {

		int[]q= {1,2,3,4,5};

		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < q.length; i++) {
			queue.offer(q[i]);
			
		}
		
		int k=3;
		Queue<Integer> reverseFirstK = reverseFirstK(queue, k);
		System.out.println(reverseFirstK);

	}
}
