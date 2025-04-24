package javaPractice;

import java.util.Arrays;
import java.util.Spliterator;

public class ArrayLearnings {
	public static void main(String[] args) {


		//		Declaration & Initialization

		int[] arr1 = new int[5];  // Array with default values (0)
		int[] arr2 = {1, 2, 3, 4, 5};  // Direct initialization
		int[] arr3 = new int[]{10, 20, 30};  // Another way to initialize

		//	Accessing Elements
		int firstElement = arr2[0];  // Access first element
		arr2[2] = 99;  // Modify an element


		//Array Traversal

		//	Using a for-loop

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}


		//Using an enhanced for-loop (for read-only operations)

		for (int num : arr2) {
			System.out.print(num + " ");
		}


		//Multi-Dimensional Arrays

		//Declaration & Initialization		

		int[][] matrix = {{10,20,30},
				{40,50,60},
				{70,80,90}};

		int value = matrix[1][2];  // Gets 6
		System.out.println(value);
		matrix[2][0] = 100;  // Modifies element

		System.out.println(Arrays.deepToString(matrix));//print the multidimensional array
		
		
		//Looping through a 2D array

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}



		//		Finding the Maximum & Minimum


		int max = Arrays.stream(arr1).max().getAsInt();
		int min = Arrays.stream(arr1).min().getAsInt();
		System.out.println("Max Element"+max);
		System.out.println("Min Element"+min);

		//copy the array
		int[] arr = {1, 2, 3};
		int[] newArr = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(newArr));  // Output: [1, 2, 3, 0, 0]


		//Arrays.toString() – Convert Array to String
		int[] arr4 = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(arr4));  // Output: [10, 20, 30, 40, 50]

		//sorting in ascending
		int[] arr5 = {5, 2, 8, 1, 3};
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));  // Output: [1, 2, 3, 5, 8]

		//Arrays.fill() 
		int[] arr6 = new int[5];
		Arrays.fill(arr6, 100);
		System.out.println(Arrays.toString(arr6));  // Output: [100, 100, 100, 100, 100]


		//	Arrays.binarySearch() 
		int[] arr7 = {10, 20, 30, 40, 50};
		int index = Arrays.binarySearch(arr7, 30);
		System.out.println("Element found at index: " + index);  // Output: Element found at index: 2
		
		String[] sarr = {"apple","ball","cat"};
		Arrays.binarySearch(sarr, "ball");

		// Arrays.copyOfRange() – Copy a Range
		int[] arr8 = {10, 20, 30, 40, 50};
		int[] subArr = Arrays.copyOfRange(arr8, 1, 4); // Copies indexes 1 to 3
		System.out.println(Arrays.toString(subArr));  // Output: [20, 30, 40]


		//Arrays.equals() – Compare Two Arrays
		int[] arr9 = {1, 2, 3};
		int[] arr10 = {1, 2, 3};
		int[] arr11 = {1, 2, 4};

		System.out.println(Arrays.equals(arr9, arr10));  // Output: true
		System.out.println(Arrays.equals(arr9, arr11));  // Output: false


		//	Arrays.deepToString() – Print Multi-Dimensional Arrays
		int[][] matrix1 = {
				{1, 2, 3},
				{4, 5, 6}
		};

		System.out.println(Arrays.deepToString(matrix1));
		// Output: [[1, 2, 3], [4, 5, 6]]

		//Arrays.parallelSort() – Faster Sorting
		//parallelSort() is faster than sort() for large arrays (uses multithreading)

		int[] arr12 = {10, 5, 3, 8, 2};
		Arrays.parallelSort(arr12);
		System.out.println(Arrays.toString(arr12));  // Output: [2, 3, 5, 8, 10]
		
        // Example for Arrays.mismatch()
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 0, 4, 5};

        // Find the first mismatched index
        int mismatchIndex = Arrays.mismatch(array1, array2);
        if (mismatchIndex != -1) {
            System.out.println("Arrays mismatch at index: " + mismatchIndex);
        } else {
            System.out.println("Arrays are identical.");
        }

        // Example for Arrays.spliterator()
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        Spliterator<String> spliterator = Arrays.spliterator(names, 1, names.length); // From index 1 to end

        System.out.println("Spliterator elements:");
        spliterator.forEachRemaining(System.out::println);


	}

}
