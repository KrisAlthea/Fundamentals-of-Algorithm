package Basics;

import java.util.Arrays;

public class BasicsTest {

	static int N;

	static int[] array = {3, 1, 2, 7, 4, 3, 5};

	public static void main (String[] args) {
//		quickSortTest(array);
		mergeSortTest(array, array.length);
	}

	static void quickSortTest(int[] array){
		int[] ans = QuickSort.quickSort(array, 0, 6);
		System.out.println(Arrays.toString(ans));
	}

	static void mergeSortTest(int[] array, int n){
		new MergeSort(n);
		int[] ans = MergeSort.mergeSort(array, 0, 6);
		System.out.println(Arrays.toString(ans));
	}
}
