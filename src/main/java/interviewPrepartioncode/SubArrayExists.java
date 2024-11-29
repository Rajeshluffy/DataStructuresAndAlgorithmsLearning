package interviewPrepartioncode;

import java.util.HashMap;

import org.junit.Test;

public class SubArrayExists {
	/*
	 * Initialize the sum var as zero
	 * Initialize HashMap
	 * Initialize the for loop till arr
	 * 
	 * loop starts
	 * sum the arr[i]
	 * 	if 
	 * 		check sum is contains in the map
	 * 			return true
	 *  else
	 *  	add that in the map sum in the key and value as 1
	 *  
	 *  loop ends
	 * 
	 * return false
	 */

	public  boolean subArrayExists(int arr[], int n) {
		int sum =0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			sum+=arr[i];//0
			if (map.containsKey(sum)) {
				return true;
			}
			map.put(sum, 1);
		}
		return false;

	}

	@Test
	public void data1() {
		int[] arr = {-3, 2, 3, 1, 6};
		int n = arr.length;
		System.out.println(	subArrayExists(arr,n));

	}
	@Test
	public void data2() {
		int[] arr = {4, 2, 0, 1, 6};
		int n = arr.length;
		System.out.println(	subArrayExists(arr,n));

	}
	@Test
	public void data3() {
		int[] arr = {4, 2, -3, 1, 6};
		int n = arr.length;
		System.out.println(	subArrayExists(arr,n));

	}
	@Test
	public void data4() {
		int[] arr = {2, -2};
		int n = arr.length;
		System.out.println(	subArrayExists(arr,n));

	}



}


