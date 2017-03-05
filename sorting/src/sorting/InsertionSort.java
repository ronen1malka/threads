package sorting;

import java.util.Arrays;

public class InsertionSort {

	public int[] sort(int[] list) {
		int i, j, key, temp;
		for (i = 1; i < list.length; i++) {
			key = list[i];
			j = i - 1;

			while (j >= 0 && key < list[j]) {
				temp = list[j];
				list[j] = list[j + 1];
				list[j + 1] = temp;
				j--;
			}

		}

		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 7,4,10,1,8,3 };
		InsertionSort x = new InsertionSort();
		System.out.println(Arrays.toString(arr));
		int[] testlist = x.sort(arr);						
		System.out.println(Arrays.toString(testlist));
		
		System.out.println("Done");
	}

}
