package interviewPrepartioncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class UncommonCharacters {
	/* Initiate new string variable
	 * take the string
	 * 		iterate the individual character 
	 * 			if character not contains in the second string
	 * 				add the character to set
	 * 		create a new list
	 * 		sort the new List
	 * return the new List
	 * 				
	 */

	
	public String uncommonCharacters(String str1, String str2) {


		Set<String> unqiueCharacterSet = new HashSet<>();
		characterFilter(str1,str2,unqiueCharacterSet);
		characterFilter(str2,str1,unqiueCharacterSet);
		List<String> sortedList = new ArrayList<>(unqiueCharacterSet);
		Collections.sort(sortedList);
		String result = String.join(" ", sortedList);

		return result;

	}

	private Set<String> characterFilter(String str1, String str2,Set<String> unqiueCharacterSet) {
		for (int i = 0; i < str1.length(); i++) {
			if (str2.indexOf(str1.charAt(i))==-1) {
				unqiueCharacterSet.add(Character.toString(str1.charAt(i)));				
			}
		}
		return unqiueCharacterSet;
	}
	@Test
	public void data1() {
		String str1="characters";
		String str2="alphabets";
		System.out.println(uncommonCharacters(str1,str2));
	}

	@Test
	public void data2() {
		String str1="geeksforgeeks";
		String str2="geeksquiz";
		System.out.println(uncommonCharacters(str1,str2));
	}
}
