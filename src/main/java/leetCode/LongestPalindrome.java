package leetCode;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LongestPalindrome {
	/*
	 * ip-string
	 * op-string
	 * 
	 * Function longestPalindrome(s):
    If s is empty or length of s < 1:
        Return ""

    Initialize start = 0, end = 0

    For each index i in s:
        len1 = expandAroundCenter(s, i, i)       // Odd length palindrome
        len2 = expandAroundCenter(s, i, i + 1)   // Even length palindrome
        maxLength = max(len1, len2)

        If maxLength > (end - start):
            start = i - (maxLength - 1) / 2
            end = i + maxLength / 2

    Return substring(s, start, end + 1)


Function expandAroundCenter(s, left, right):
    While left >= 0 AND right < length of s AND s[left] == s[right]:
        Decrease left by 1
        Increase right by 1

    Return (right - left - 1)  // Length of the palindrome
	 *
	 * 
	 * 
	 * 
	 */

	public String longestPalindrome(String s) {
		if (s == null || s.length() < 1) return "";

		int start = 0, end = 0;

		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i); // Odd length palindromes
			int len2 = expandAroundCenter(s, i, i + 1); // Even length palindromes
			int len = Math.max(len1, len2);

			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}

		return s.substring(start, end + 1);
	}

	private int expandAroundCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1; // Length of palindrome
	}



	@Test
	public void testData1() {
		String s=	"babad";
		System.out.println(longestPalindrome(s));

	}
	@Test
	public void testData2() {
		String s=	"aaaa";
		System.out.println(longestPalindrome(s));
	}
	@Test
	public void testData3() {
		String s=	"";
		System.out.println(longestPalindrome(s));
	}
	@Test
	public void testData4() {
		String s=	" ";
		System.out.println(longestPalindrome(s));
	}
	@Test
	//negative case 
	public void testData5() {
		String s=	"abcd";
		System.out.println(longestPalindrome(s));
	}

	public void testData6() {
		String s=	"a";
		System.out.println(longestPalindrome(s));
	}


}
