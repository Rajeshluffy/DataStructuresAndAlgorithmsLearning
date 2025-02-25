package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class ShortestToChar {
	/*
	 * Initialize the arr variables
	 * 
	 * Initialize lastSeen 
	 * iterate find the char from left side
	 * 
	 * reassign lastSeen
	 * iterate find the char from right side
	 * 	find the min index
	 * 
	 * result index
	 * 
	 */
	
	public int[] shortestToChar(String s, char c) {
		int n =s.length();
		int[] result = new int[n];
		Arrays.fill(result, n); // Initialize with max distance
		int lastSeen=-n;

		for (int i = 0; i < n; i++) {
			if(s.charAt(i)==c) {
				lastSeen=i;
			}
			result[i]=i-lastSeen;
		}

		lastSeen=2*n;
		for (int i =  n-1; i >=0; i--) {
			if(s.charAt(i)==c) {
				lastSeen=i;
			}
			
			result[i]=	Math.min(result[i], lastSeen-i);
		}
		return result;

	}

	@Test
	public void testdata1() {
		String s="loveleetcode";
		char c='e';
		int[] shortestToChar = shortestToChar(s,c);
		System.out.println(Arrays.toString(shortestToChar));
	}

	@Test
	public void testdata2() {
		String s="loveleetcode";
		char c='z';
		int[] shortestToChar = shortestToChar(s,c);
		System.out.println(Arrays.toString(shortestToChar));	}

	@Test
	public void testdata3() {
		String s="love2eetcode";
		char c='t' ;
		int[] shortestToChar = shortestToChar(s,c);
		System.out.println(Arrays.toString(shortestToChar));	}
}
