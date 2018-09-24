public class InsertionSort implements SortingAlgorithm {

	public void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			for (int j = i - 1; j >= 0; j--) {
				if (temp <= a[j]) {
					shiftRight(a, j);
				} else {
					a[j + 1] = temp;
					break;
				}	
			}	
		}	
	}	
	
	static void shiftRight(int[] a, int j) {
		a[j + 1] = a[j];
	}
}
