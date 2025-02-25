package leetCode;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
/**
 * A solution to Unique Occurrences problem.
 * 
 * @author rajesh
 * @see <a href="https://leetcode.com/problems/unique-number-of-occurrences/description/">Unique Occurrences - LeetCode</a>
 */
public class UniqueOccurrences {
/*
 * Initialize the map
 * Iterate the int[] arr 
 * add the each element of the map
 * 		key the individual array element
 * 		value  of the each element occurrence
 * get the keyset and store it as variable (Set)
 * get the values and store it as variable (list)
 * convert the list to set by initialize new set
 * 
 * compare the size of the keyset and new set
 * 		positive return true
 * 		negative return false
 * 
 */

	public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
	
		for (int i = 0; i < arr.length; i++) {// O(n)
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		Set<Integer> keySet = map.keySet();
		Collection<Integer> values = map.values();
		HashSet<Integer> hashSet = new HashSet<>(values);
		if (keySet.size()==hashSet.size()) {
			return true;	
		}
		/*
		 * 1,3
		 * 2,2
		 * 3,1
		 * 
		 * 
		 * 1,1
		 * 2,1
		 */

		return false;
	}

	@Test
	public void data1() {
		int[] arr = {1,2,2,1,1,3};
		System.out.println(uniqueOccurrences(arr));

	}
	@Test
	public void data2() {
		int[] arr = {1,2};

		System.out.println(uniqueOccurrences(arr));

	}
	@Test
	public void data3() {
		int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};

		System.out.println(uniqueOccurrences(arr));
	}
}
