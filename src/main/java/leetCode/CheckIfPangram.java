package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * A solution to check If Pangram problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/">check If Pangram - LeetCode</a>
 */
public class CheckIfPangram {
	/*
	 * Initiate Hashset
	 * check the string length is less than 26
	 * 		true return false
	 * 
	 * Initiate two pointer var ,declare one as zero and other as length of the string
	 * 
	 * while condition check (i<j)
	 *  get the ASCII value of the pointer
	 *  
	 *  ADD the value in the set
	 *  	check set size is reached 26
	 *   		return true
	 */
	public boolean checkIfPangram(String sentence) {
		   HashMap<Integer, Integer> map = new HashMap<>();

			if (sentence.length()<26) {
				return false;
			}
			int i = 0;
			int j =sentence.length()-1;
			while(i<j) {
				int ch1 = sentence.charAt(i);
				int ch2 = sentence.charAt(j);

				if(!map.containsKey(ch1)) {
					map.put(ch1, 1);
				}
				if(!map.containsKey(ch2)) {
					map.put(ch2, 1);
				}
	            if (map.size()== 26) {
					return true;
				}
				i++;
				j--;
			}

			return false;
	}
	public boolean checkIfPangram_Using_Set(String sentence) {
		//O(n) O(1)
		Set<Integer> set = new HashSet<>();

		if (sentence.length()<26) {
			return false;
		}
		int i = 0;
		int j =sentence.length()-1;
		while(i<j) {
			int ch1 = sentence.charAt(i);
			int ch2 = sentence.charAt(j);

			if(!set.contains(ch1)) {
				set.add(ch1);
			}
			if(!set.contains(ch2)) {
				set.add(ch2);
			}
			if (set.size()== 26) {
				return true;
			}
			i++;
			j--;
		}

		return false;

	}

	
	@Test
	public void data1() {
		String str= "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(str));

	}
	@Test
	public void data2() {
		String str= "leetcode";
		System.out.println(checkIfPangram(str));

	}
}
