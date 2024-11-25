package interviewPrepartioncode;

import org.junit.jupiter.api.Test;

public class ReplacingVowel {
	/*
	 * input string
	 * output string
	 * two pointer algo
	 * 
	 * Hello Everyone! Welcome to Testleaf
	 * pseudo code
	 * 
	 * initialize two pointer variable
	 * declare a array contains 
	 * first point from left 
	 * second point from right
	 * 
	 * [a,e,i,o,u] compare it with variable
	 * replace it 
	 * return it
	 * 
	 * 	
	 * 
	 * 
	 * 
	 */
	// pseudo code
	//	if	p1&p2	are vowel -->	swap the character -->	increase the  p1 and  decrease the p2	
	//	if	p1 is vowel			
	//			p2 pointer increase	-->wait till vowel identified --> swap decrease the both p2
	//						
	//	if	p2	vowel			
	//			p1 pointer increase--> wait till vowel identified --> swap increase the both p1
	//if p1 & p2 are not vowel 
	//          increase the p1 and decrease the p2	
	public void vowelCharacterDeletion(String name) {
		int left =0;
		int right = name.length()-1;

		while(left<right) {
			char temp1 = name.charAt(left);
			char temp2 = name.charAt(right);

			boolean vowelChecker = vowelChecker(String.valueOf(temp1));
			boolean vowelChecker1 = vowelChecker(String.valueOf(temp2));

			if (vowelChecker&&vowelChecker1) {

				StringBuilder stringBuilder = new StringBuilder(name);
				stringBuilder.setCharAt(left, temp2);
				stringBuilder.setCharAt(right, temp1);
				name=stringBuilder.toString();
				left++;
				right--;

			}else if(vowelChecker && !vowelChecker1){
				right--;

			}else if (!vowelChecker&&vowelChecker1) {

				left++;

			}else if (!vowelChecker&&!vowelChecker1) {
				left++;
				right--;
			} 
		}
		System.out.println(name);
	}
	public boolean vowelChecker(String str) {
		String[] vow = {"a","e","i","o","u"};
		for (int i = 0; i < vow.length; i++) {
			if (str.equalsIgnoreCase(vow[i])) {
				return true;
			}
		} 
		return false;
	}


	@Test
	public void testData1() {
		String name ="Hello Everyone! Welcome to Testleaf";
		vowelCharacterDeletion(name);
	}

	@Test
	public void testData2() {
		String name ="dddd kkk";
		vowelCharacterDeletion(name);
	}




}
