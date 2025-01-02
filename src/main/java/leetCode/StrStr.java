package leetCode;

import org.junit.Test;

public class StrStr {
	/**
	 * A solution to the Find the Index of the First Occurrence in a String problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">Find the Index of the First Occurrence in a String- LeetCode</a>
	 */

	public int strStrUsingBuildFunction(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
	/*
	 * get the first index of haystack and compare with needle first index
	 * 		if yes compare with rest needle 
	 * 		failed to match entire needle reset the needle index
	 * 		increase the haystack index and compare till p1 exhaust
	 * 
	 */

	public int strStr(String haystack, String needle) {
		if(haystack.equals(needle)||needle.isEmpty()) {
			return 0;
		}
		if (haystack.length()<needle.length()) return -1;

		int p1=0,p2=0;

		while(p1 < haystack.length()) {
			int temp=p1;
			while (haystack.charAt(temp)==needle.charAt(p2)) {
				p2++;
				temp++;
				if(needle.length()==p2) {
					return p1;
				}
				if(temp > haystack.length()-1) {
					return -1;
				}
			}
			p2=0;
			p1++;
		}

		return -1;
	}
	@Test
	public void testData1() {
		String haystack ="sadbutsad";
		String needle="sad";
		System.out.println(strStr(haystack,needle));	
	}

	@Test
	public void testData2() {
		String haystack ="leetcode";
		String needle="leeto";
		System.out.println(strStr(haystack,needle));		
	}
	@Test
	public void testData3() {
		String haystack="hello";
		String needle="ll";
		System.out.println(strStr(haystack,needle));		
	}
	@Test
	public void testData4() {
		String haystack="abc";
		String needle="c";
		System.out.println(strStr(haystack,needle));		
	}
	@Test
	public void testData5() {
		String haystack ="aaa";
		String needle="aaaa";
		System.out.println(strStr(haystack,needle));		
	}
	@Test
	public void testData6() {
		String haystack ="mississippi";
		String needle="pi";
		System.out.println(strStr(haystack,needle));		
	}
	@Test
	public void testData7() {
		String haystack ="mississippi";
		String needle="issipi";
		System.out.println(strStr(haystack,needle));		
	}
}
