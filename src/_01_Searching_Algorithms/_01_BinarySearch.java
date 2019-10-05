package _01_Searching_Algorithms;

public class _01_BinarySearch {
	public static int binarySearch(int[] array, int start, int end, int value) {
		if (end >= start) {
			int middle = (start + end) / 2;
			if (array[middle] == value) {
				return middle;
			}
			if (array[middle] > value) {
				return binarySearch(array, start, middle - 1, value);
			}
			return binarySearch(array, middle + 1, end, value);
		}
		return -1;
	}
}
