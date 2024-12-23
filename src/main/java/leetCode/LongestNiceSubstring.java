package leetCode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;
/**
 * A solution to the Longest Substring Without Repeating Characters problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/description/">
 * 						Longest Substring Without Repeating Characters- LeetCode</a>
 */
public class LongestNiceSubstring {
	
	public String longestNiceSubstring_ASCII(String s) {

		if (s.length()<2) {
			return "";	
		}

		// find all possible the sub string
		String temp ="";
		List<String> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			temp="";
			for(int j=i;j<s.length();j++) {
				temp +=s.charAt(j);
				if(temp.length()>1) {
					list.add(String.valueOf(temp));
				}

			}
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		String possibleString = "";

		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);


			for (int j = 0; j < string.length(); j++) {
				char charac = string.charAt(j);
				boolean lowerCase = Character.isLowerCase(charac);
				if (lowerCase) {
					int asc  = string.charAt(j);

					if (map.containsKey(asc-32)) {
						map.put(asc-32, 2);
					}else if(!map.containsKey(asc)){
						map.put(asc, 1);

					}

				}else {
					int asc  = string.charAt(j);
					if (map.containsKey(asc+32)) {
						map.put(asc+32, 2);

					}else{
						map.put(asc, 1);

					}
				}
			}
			List<Integer> values = (List<Integer>) map.values();
			boolean contains = values.contains(1);
			if(!contains) {
				if(string.length()>possibleString.length()) {
					possibleString= string;
				}

			}
			map.clear();


		}

		return 	possibleString;
	}
	public String longestNiceSubstring(String s) {
			if (s.length()==1) {
				return "";	
				}
			String possibleString = "";
			int p1 =0,p2=0;
			while(p2<s.length()) {	
				if(p1!=p2) {
	
					String temp1 = String.valueOf(s.charAt(p1));
					String temp2 = String.valueOf(s.charAt(p2));
					int ascii1 = s.charAt(p1);
					int ascii2 = s.charAt(p2);
	
					if (temp1.equals(temp2)||Math.abs(ascii1-ascii2)==32) {
						String	 substring = s.substring(p1, p2+1);
						if (substring.length()>=possibleString.length()) {
							possibleString=substring;
						}
	
					}else {
	
						p1++;
	
					}
	
					p2++;
	
	
				}else {
					p2++;
				}
	
	
			}
	
	
			return 	possibleString;
		}

	
		@Test
		public void testData1() {
			String s ="YazaAay";
			System.out.println(longestNiceSubstring(s));
		} 
	
		@Test
		public void testData2() {
			String s ="Bb";
			System.out.println(longestNiceSubstring(s));
		} 
		@Test
		public void testData3() {
			String s ="c";
			System.out.println(longestNiceSubstring(s));
		} 
	@Test
	public void testData4() {
		String s ="CchH";
		System.out.println(longestNiceSubstring(s));
	} 
}
