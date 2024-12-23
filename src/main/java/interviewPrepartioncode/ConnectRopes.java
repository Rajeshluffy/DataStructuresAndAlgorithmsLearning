package interviewPrepartioncode;

import java.util.PriorityQueue;

import org.junit.Test;

public class ConnectRopes {

	public int minimumRequired(int[] len) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < len.length; i++) {
			pq.add(len[i]);
		}

		int result =0;
		while (pq.size()>1) {
			int rope1Length=pq.poll();
			int rope2Length=pq.poll();
			result+=rope1Length+rope2Length;
			pq.add(rope1Length+rope2Length);
		}

		return result;

	}


	@Test
	public void testData1() {
		int len[] = { 4, 3, 2, 6 };
		System.out.println(minimumRequired(len));
	}
}
