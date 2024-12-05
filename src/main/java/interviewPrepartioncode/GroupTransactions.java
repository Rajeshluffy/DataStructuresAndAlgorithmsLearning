package interviewPrepartioncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class GroupTransactions {
	/*
	 * map created
	 * for arr[0] is exists
	 * 	map()
	 * 		string 1
	 * else
	 * 		string increase
	 * 
	 * retun the map
	 * 
	 */

	private ArrayList<String>  findTranscationCOunt(String[] arr) {
		TreeMap<String, Integer> map =new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		
		}
		// Converting tree map into set and then list
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(entrySet);
		//Sort the list to descending order
		list.sort((i1, i2) -> i2.getValue().compareTo(i1.getValue()));
		//Creating a new outputList
		ArrayList<String> groupOfTranscation = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			Entry<String, Integer> entry = list.get(i);
			groupOfTranscation.add(entry.getKey()+" "+entry.getValue());
		}

		return groupOfTranscation;

	}



	@Test
	public void data1() {
		String[] arr = {"notebook", "notebook", "mouse", "keyboard", "mouse"};
		System.out.println(findTranscationCOunt(arr));
	}
}
