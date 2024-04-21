package Basics;


public class QuickSort {

	public static int[] quickSort(int[] array, int l, int r){
		if (l >= r) return array;
		int mid = array[l];
		int i = l - 1;
		int j = r + 1;
		while (i < j){
			do i++; while(array[i] < mid);
			do j--; while(array[j] > mid);
			if (i < j) {
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
			}
		}
		array = quickSort(array, l, j);
		array = quickSort(array, j + 1, r);
		return array;
	}


}
