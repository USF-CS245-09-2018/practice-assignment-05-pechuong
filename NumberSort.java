import java.util.TreeMap;

public class NumberSort {
	
	public static void main(String[] args) {
		int[] numbers = new int[] {1, 5, 3, 2, 7};
		TreeMap<Integer, Integer> map = new TreeMap<>();

		for (int num : numbers) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num)++);
				continue;
			}
			map.put(num, 1);
		}
	}

}
