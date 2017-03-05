package sorting;

import java.util.Arrays;

public class BubbleSort {

	public int[] sort(int[] list) {
		for (int i = 0; i <= list.length ; i++) {
			bubble(list, list.length - i-1);
		}
		return list;
	}

	private void bubble(int[] arr, int lastPos) {
		for (int i = 0; i < lastPos; i++) {
			if (arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	public static void main(String[] args) {
		BubbleSort x = new BubbleSort();
		int[] arr = { 5, 8, 1, 6, 9, 2 };
		System.out.println(Arrays.toString(arr));
		x.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Done.");

	}

}
