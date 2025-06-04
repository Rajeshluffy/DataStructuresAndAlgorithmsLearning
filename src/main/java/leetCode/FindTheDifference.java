package leetCode;

import java.util.HashMap;

import org.junit.Test;

public class FindTheDifference {
	/**
	 * A solution to the Find the Difference.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/find-the-difference/">findTheDifference- LeetCode</a>
	 */

	/*
	 * add the ascii value of two string
	 * find the difference type case to char and find the missing.
	 */
	public char findTheDifference(String s, String t) {

		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(map.put(c, 0),+1));
		}

		for (char c : t.toCharArray()) {
			map.put(c, map.getOrDefault(map.put(c, 0),-1));
			if(map.get(c)<0) {
				return c;
			}
		}

		return ' ';
	}

	public char findTheDifferencebruteForce(String s, String t) {
		int s1=0;int s2=0;
		for (char c : s.toCharArray()) {
			s1 +=c;
		}

		for (char c : t.toCharArray()) {
			s2 +=c;
		}

		return (char) (s2 - s1);
	}



	@Test
	public void data1() {
		String s  = "abcd";
		String t  = "abcde";
		System.out.println(	findTheDifference(s, t));

	}

	@Test
	public void data2() {
		String s  = "";
		String t  = "y";
		System.out.println(	findTheDifference(s, t));

	}
}
