package leetCode;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
/**
 * A solution to the Longest Substring Without Repeating Characters problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/description/">
 * 						Longest Substring Without Repeating Characters- LeetCode</a>
 */
public class LengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s) {

		int p1=0,p2=0,maxLength=Integer.MIN_VALUE;
		HashMap<Character, Integer> map = new HashMap<>();
		while (p2<s.length()) {
			map.put(s.charAt(p2), map.getOrDefault(s.charAt(p2), 0)+1);
			while (map.get(s.charAt(p2))>1) {
				map.put(s.charAt(p1), map.getOrDefault(s.charAt(p1), 0)-1);
				p1++;
			}
			maxLength=Math.max(maxLength, p2-p1+1);
			p2++;
		}
		return maxLength;
	}
	@Test
	public void testData1() {
		String s ="abcabcbb";	
		System.out.println(lengthOfLongestSubstring(s));
	}
	@Test
	public void testData2() {
		String s ="bbbbb";	
		System.out.println(lengthOfLongestSubstring(s));
	}
	@Test
	public void testData3() {
		String s ="pwwkew";	
		System.out.println(lengthOfLongestSubstring(s));
	}
}
