package leetCode;

import org.junit.Test;

public class ReverseWords {
	public String reverseWords(String s) {
		
		String[] individual = s.trim().split("\\s+");
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = individual.length-1; i >=0 ; i--) {
			stringBuilder.append(individual[i]);
			if(i!=0) {
				stringBuilder.append(" ");
			}
		}
		return stringBuilder.toString();
	}

	@Test
	public void testData1() {
		String s = "the sky is blue";
		System.out.println(reverseWords(s));		
	}
}
