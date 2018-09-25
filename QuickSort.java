import java.util.Arrays;

public class QuickSort /*implements SortingAlgorithm*/ {

	public static void main(String[] args) {
		int[] test = new int[] {3, 5, 1, 2, 4};
		sort(test);
		System.out.println(Arrays.toString(test));

	}

	public static void sort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}
	
	public static void quickSort(int[] a, int left, int right) {
		if (left < right) {
			int pivot = partition(a, left, right);
			System.out.println("left = " + left);
			System.out.println("right = " + right);
			System.out.println("pivot = " + pivot);

			quickSort(a, left, pivot - 1);
			System.out.println("Hello I'm starting to do quickSort on the right side");
			quickSort(a, pivot + 1, right);
		}
	}

	public static int partition(int[] a, int left, int right) {
			int pivot = left;
			int i = left + 1;
			int k = right;
			System.out.println(Arrays.toString(a));
			while (i < k) {
				while (i < right && a[i] < a[pivot]) {
					i++;
				}
				while (k > i && a[k] > a[pivot]) {
					k--;
				}
				if (i < k) {
					swap(a, i, k);
				}
				System.out.println(Arrays.toString(a));
			}
			swap(a, pivot, k);
			System.out.println(Arrays.toString(a));
			return k;
	}

	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

}
