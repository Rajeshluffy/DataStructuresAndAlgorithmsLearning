package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindAnagrams {
	/**
	 * A solution to the Find All Anagrams in a String.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/">Find All Anagrams in a String - LeetCode</a>
	 */
	public List<Integer> findAnagrams(String s, String p) {
	
		List<Integer> result = new ArrayList<>();
		 if (s.length() < p.length()) return result;
		/*
		 * expand the window till p length
		 * 	take the sub string of the window and sort
		 * 		yes - add start index of
		 *  	no shrink the window
		 * 
		 */

		int p1=0,p2=0;
		while(p2<s.length()) {
			if((p2-p1+1) == p.length()) {
				char[] sortSubString = s.substring(p1,p2+1).toCharArray();
				Arrays.sort(sortSubString);	
				if(Arrays.equals(sortSubString, p.toCharArray())) {
					result.add(p1);
				}
				p1++;
			}
			p2++;
		}
		return result;
	}

	@Test
	public void testData1() {
		String s = "cbaebabacd", p = "abc";
		System.out.println(findAnagrams(s,p));	
	}
	
	@Test
	public void testData2() {
		String s = "abab", p = "ab";
		System.out.println(findAnagrams(s,p));	
	}
	@Test
	public void testData3() {
		String s = "abab", p = "";
		System.out.println(findAnagrams(s,p));	
	}
}
