package _01_Searching_Algorithms;

public class _03_ExponentialSearch {
	public static int exponentialSearch(int array[], int value) {
		if (array[0] == value) {
			return 0;
		}
		int counter = 1;
		while (counter < array.length && array[counter] <= value) {
			counter = counter * 2;
		}
		int minimum;
		if (counter < array.length) {
			minimum = counter;
		} else {
			minimum = array.length - 1;
		}
		int result = _01_BinarySearch.binarySearch(array, counter / 2, minimum, value);
		return result;
	}
}
