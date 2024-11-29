package interviewPrepartioncode;

import java.util.HashMap;

import org.junit.Test;

public class LeastSubArray {



	public int leastSubArray(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, -1);
		int sum=0 ,maxLength=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];

			if (map.containsKey(sum)) {
				maxLength=Math.max(maxLength, i-map.get(sum));
			}else {
				map.put(sum, i);
			}
		}



		return maxLength;

	}

	@Test
	public void data1() {
		int[] arr = {15,-2,2,-8,1,7,10,23};
		System.out.println(leastSubArray(arr));

	}

	@Test
	public void data2() {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(leastSubArray(arr));

	}
	
	
	@Test
	public void data3() {
		int[] arr = {1};
		System.out.println(leastSubArray(arr));

	}
	@Test
	public void data4() {
		int[] arr = {5,4,-1,7,8};
		System.out.println(leastSubArray(arr));

	}
}
