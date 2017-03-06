package sorting;

import java.util.Arrays;

public class QuickSort3 {
	public void sort(int[] list, int start, int end) {
		if (start < end) {
			int pIndex = partition(list, start, end);
			sort(list, start, pIndex - 1);
			System.out.println(Arrays.toString(list));
			sort(list, pIndex + 1, end);
			System.out.println(Arrays.toString(list));
		}
	}

	private int partition(int[] arr, int start, int end) {
		int pIndex = start;
		int pivot = arr[end];
		for (int i = start; i < arr.length - 1; i++) {
			if (arr[i] < pivot) {
				ArrUtils.swap(arr, pIndex, i);				
				pIndex++;
			}			
		}
		ArrUtils.swap(arr, end, pIndex);		
		return pIndex;
	}

	public static void main(String[] args) {
		QuickSort3 x = new QuickSort3();
		int[] arr = { 40, 70, 20, 50, 10, 90, 80, 30 };
		x.sort(arr, 0, 7);
		System.out.println(Arrays.toString(arr));
		System.out.println("Done.");

	}
}
