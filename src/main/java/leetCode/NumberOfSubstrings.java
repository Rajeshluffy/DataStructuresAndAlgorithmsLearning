package leetCode;

import java.util.Hashtable;

import org.junit.Test;

public class NumberOfSubstrings {

	/**
	 * A solution to the Matrix Diagonal Sum problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/">number of string- LeetCode</a>
	 */
	public int numberOfSubstrings(String s) {
		Hashtable<Character,Integer> subString = new Hashtable<>();
		int p1=0,p2=0,count=0;
		while(p2<s.length()) {
			//Expand
			subString.put(s.charAt(p2), subString.getOrDefault(s.charAt(p2),0)+1);

			//Shrink
			while(subString.getOrDefault('a',0)>0 && 
					subString.getOrDefault('b',0)>0 &&
					subString.getOrDefault('c',0)>0) {
				count += s.length() - p2;				char charAt = s.charAt(p1);
				subString.put(charAt, subString.get(charAt)-1);
				p1++;

			}
			p2++;


		}

		return count;

	}

	@Test
	public void testData1() {
		String	s = "abcabc";
		System.out.println(		numberOfSubstrings(s));

	}
	
	@Test
	public void testData2() {
		String	s = "aaacb";
		System.out.println(		numberOfSubstrings(s));
	}
	@Test
	public void testData3() {
		String	s = "abc";
		System.out.println(numberOfSubstrings(s));
	}
}
