package sorting;

import java.util.Arrays;

public class ArrUtils {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
