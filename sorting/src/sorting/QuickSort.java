package sorting;

public class QuickSort {
	public int[] sort(int[] list) {
		//int pivot = list.length - 1;
		int L = 0;
		int R = list.length - 2;
		ArrUtils.printArray(list);
		System.out.println("");
		int newPivot = partition(list, L, R);
		ArrUtils.printArray(list);
		System.out.println("New Pivot is " + newPivot);
		return list;
	}

	private int partition(int[] arr, int L, int R) {
		int pivot = R + 1;
		boolean rFound = false;
		boolean lFound = false;
		L = L - 1;
		R = R + 1;
		while (true) {
			while (!lFound) {
				L++;
				lFound = (L == R) || (arr[L] > arr[pivot]);
			}
			if (L == R) {
				ArrUtils.swap(arr, L, pivot);
				ArrUtils.printArray(arr);
				if (L - 1 == 2) {
					partition(arr, 0, L - 2);
				} else {
					return L;
				}
			}

			while (!rFound) {
				R--;
				rFound = (L == R) || (arr[R] < arr[pivot]);
			}
			if (L == R) {
				ArrUtils.swap(arr, L, pivot);
				ArrUtils.printArray(arr);
				if (arr.length - (R + 1) > 2) {
					partition(arr, R + 1, arr.length-2);
				} else {
					return R;
				}
			} else {
				ArrUtils.swap(arr, L, R);
				ArrUtils.printArray(arr);
			}
			lFound = false;
			rFound = false;
		}

	}

	public static void main(String[] args) {
		QuickSort x = new QuickSort();
		int[] arr = { 17, 41, 5, 22, 54, 6, 29, 3, 13 };
		x.sort(arr);
		// System.out.println(Arrays.toString(arr));
		System.out.println("Done.");

	}
}
