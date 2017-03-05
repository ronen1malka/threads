package sorting;

import java.util.Arrays;

public class BubbleSort {

	public int[] sort(int[] list) {
		for (int i = 0; i <= list.length ; i++) {
			ArrUtils.printArray(list);
			bubble(list, list.length - i-1);
			ArrUtils.printArray(list);
			System.out.println("");
		}
		return list;
	}

	private void bubble(int[] arr, int lastPos) {
		for (int i = 0; i < lastPos; i++) {
			if (arr[i] > arr[i + 1]) {
				ArrUtils.swap(arr, i, i + 1);
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort x = new BubbleSort();
		int[] arr = { 5, 8, 1, 6, 9, 2 };		
		x.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Done.");

	}

}
