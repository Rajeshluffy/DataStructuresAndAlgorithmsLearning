package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class ThreeSum {


	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		// Sort the array
		Arrays.sort(nums);

		// Iterate through the array
		for (int i = 0; i < nums.length - 2; i++) {
			// Avoid duplicate solutions
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			// Initialize two pointers
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					// Move pointers to avoid duplicates
					while (left < right && nums[left] == nums[left + 1]) {
						left++;
					}
					while (left < right && nums[right] == nums[right - 1]) {
						right--;
					}

					// Move both pointers
					left++;
					right--;
				} else if (sum < 0) {
					// Move the left pointer to increase the sum
					left++;
				} else {
					// Move the right pointer to decrease the sum
					right--;
				}
			}
		}

		return result;
	}

	@Test
	public void data1() {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> threeSum = threeSum(nums);
		System.out.println(threeSum);
	}
	@Test
	public void data2() {
		int[] nums = {0,1,1};
		List<List<Integer>> threeSum = threeSum(nums);
		System.out.println(threeSum);
	}
	@Test
	public void data3() {
		int[] nums = {0,0,0};
		List<List<Integer>> threeSum = threeSum(nums);
		System.out.println(threeSum);
	}
}
