package interviewPrepartioncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FrequencyOfTheCharacter {
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
	public void charactersFrequency(String input ) {

		// Create an array to store frequencies of characters
		int[] freq = new int[256]; // ASCII has 256 characters

		// Increment frequency for each character in the string
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			freq[ch]++;
		}

		// Print frequencies of characters
		System.out.println("Character frequencies:");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) { // Only print characters that appear in the string
				System.out.println((char) i + " -> " + freq[i]);
			}
		}


	}


	@Test
	public void data1() {
		String input="characters";
		charactersFrequency(input);
	}

	@Test
	public void data2() {
		String input="geeksforgeeks";
		charactersFrequency(input);
	}
}
