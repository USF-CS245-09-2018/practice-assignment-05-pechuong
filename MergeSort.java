public class MergeSort implements SortingAlgorithm {
	
	void sort(int[] a) {
		mergeSort(a, 0, a.length() - 1);
	}
	
	void mergeSort(int[] a, int left, int right) {
		if (right <= left) {
			return;
		}
		int midPoint = (left + right)/2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		merge(arr, left, right);
	}
	
	void merge(int[] a, int left, int right) {
			

	}

}
