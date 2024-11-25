package interviewPrepartioncode;

import java.util.HashMap;

import org.junit.Test;

public class SubArrayExists {

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


}


