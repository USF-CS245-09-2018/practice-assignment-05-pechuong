import java.util.Arrays;

public class MergeSort implements SortingAlgorithm {
	
	public void sort(int[] a) {
		mergeSort(a, 0, a.length - 1);
	}
	
	void mergeSort(int[] a, int left, int right) {
		if (right <= left) {
			return;
		}
		int midPoint = (left + right)/2;
		mergeSort(a, left, midPoint);
		mergeSort(a, midPoint + 1, right);
		merge(a, left, right);
	}
	
	void merge(int[] a, int left, int right) {
		int mid = (left + right)/ 2;
		merge(Arrays.copyOfRange(a, left, mid + 1), Arrays.copyOfRange(a, mid + 1, right), a);

	}
	
	void merge(int[] leftArr, int[] rightArr, int[] a) {
		int left = 0, right = 0, target = 0;
		while (left < leftArr.length && right < rightArr.length) {
			if (leftArr[left] <= rightArr[right]) {
				a[target++] = leftArr[left++];
			} else {
				a[target++] = rightArr[right++];
			}

		}
		while (left < leftArr.length) {
			a[target++] = leftArr[left++];
		}
		while (right < rightArr.length) {
			a[target++] = rightArr[right++];
		}

	}

}
