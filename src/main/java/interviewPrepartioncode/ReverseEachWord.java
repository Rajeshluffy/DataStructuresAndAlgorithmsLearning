package interviewPrepartioncode;

import org.junit.jupiter.api.Test;

public class ReverseEachWord {
	//	initiate  the p1 as zero
	//	find the pointer p2 end point using separate method
	//  find the total number of words in the sentence
	//  iterate the loop till last
	//	swap	
	//	save the p2 value in new pointer as p3
	//	
	//	re initiate  p1 with p3 
	//	find the pointer p2 end point using separate method
	//	save the p2 value in new pointer as p3
	//	swap
	//	re initiate  p1 with p3 

	//Welcome To Testleaf
	public void reverse(String word) {
		int left =0;
		int right = findRight(word,left);
		String[] split = word.split(" ");

		for (int i = 0; i < split.length; i++) {
			word = swapEvent(word, left, right);

			/*
			 *0,6(w,e)
			 * 
			 *8,9(t,o)
			 *
			 *11,18(t,f)
			 * 
			 */
			if(i<split.length-1) {
				left =right+2;
				right = findRight(word,left);	
			}

		}

		System.out.println(word);

	}

	public String swapEvent(String word ,int left,int right) {
		while (left<right) {
			StringBuilder stringBuilder = new StringBuilder(word);
			stringBuilder.setCharAt(left, word.charAt(right));
			stringBuilder.setCharAt(right, word.charAt(left));
			word =stringBuilder.toString();
			left++;
			right--;
		}
		return word;
	}

	public int findRight(String word,int start) {
		for (int i = start; i < word.length(); i++) {
			if(String.valueOf(word.charAt(i)).equalsIgnoreCase(" ")) {
				return i-1;
			}else if(i==word.length()-1){
				return i;
			}
		}
		return -1;
	}

	@Test
	public void data1() {
		String word ="Welcome To Testleaf";
		reverse(word);
	}
	@Test

	public void data2() {
		String word ="Testleaf";
		reverse(word);
	}
	@Test

	public void data3() {
		String word ="";
		reverse(word);
	}
}
