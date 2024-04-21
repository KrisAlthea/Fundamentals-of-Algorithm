package Basics;

public class MergeSort {
	static int N;
	static int[] temp;

	public MergeSort (int n){
		N = n;
		temp = new int[N];
	}

	public static int[] mergeSort(int[] array, int l,int r){
		if (l >= r) return array;
		int mid = (l + r) / 2;
		array = mergeSort(array, l, mid);
		array = mergeSort(array, mid + 1, r);
		int k = 0, i = l, j = mid + 1;
		while (i <= mid && j <= r){
			if (array[i] <= array[j]){
				temp[k++] = array[i++];
			} else {
				temp[k++] = array[j++];
			}
		}
		while (i <= mid){
			temp[k++] = array[i++];
		}
		while (j <= r){
			temp[k++] = array[j++];
		}
		for (i = l, j = 0; i <= r;i++,j++){
			array[i] = temp[j];
		}
		return array;
	}
}
