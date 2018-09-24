public class QuickSort implements SortingAlgorithm {

	public void sort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}
	
	public void quickSort(int[] a, int left, int right) {
		int pivot = partition(a, left, right);
		quickSort(a, left, pivot - 1);
		quickSort(a, pivot + 1, right);
	}

	public int partition(int[] a, int left, int right) {
		if (left < right) {
			int pivot = left;
			int i = left + 1;
			int k = right;
			while (i < k) {
				while (i < right && a[i] < a[right]) {
					i++;
				}
				while (k > i && a[k] > a[pivot]) {
					k--;
				}
				if (i < k) {
					swap(a, left, right);
				}
			}
			swap(a, pivot, k);
			return k;
		}
		return -1;
	}

	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

}
