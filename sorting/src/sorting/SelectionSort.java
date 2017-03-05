package sorting;

public class SelectionSort {
	public int[] sort(int[] list) {
		int i;
		for (i = 0; i <= list.length - 1; i++) {
			int newMinPos = findNextMinPos(list, i);
			if (newMinPos != i) {
				ArrUtils.swap(list, i, newMinPos);
			}
			ArrUtils.printArray(list);
		}
		return list;
	}


	private int findNextMinPos(int[] arr, int pos) {
		int minVal = arr[pos];
		for (int i = pos; i <= arr.length - 2; i++) {
			if (minVal > arr[i + 1]) {
				pos = i + 1;
				minVal = arr[pos];
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		SelectionSort x = new SelectionSort();
		int[] testList = { 7, 8, 5, 8, 9, 2 };
		ArrUtils.printArray(testList);
		int[] testlist = x.sort(testList);						
		ArrUtils.printArray(testList);
		System.out.println("Done.");

	}

}
