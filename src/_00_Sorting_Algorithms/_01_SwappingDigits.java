package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void testInt() {
		int[] x = { 5, 6 };
		int[] y = { 6, 5 };
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);
	}

	@Test
	void testArray() {
		int[] z = { 7, 3, 5, 9, 2 };
		int[] q = { 2, 3, 5, 7, 9 };
		sortIntArray(z);
		assertArrayEquals(q, z);
	}

	@Test
	void testMiddle() {
		int[] m = { 7, 3, 9, 5, 2 };
		assertEquals(5, findMiddle(m));
	}

	public static void swapArrayOfTwo(int[] arr) {
		if (arr[0] < arr[1]) {
			int value = arr[0];
			arr[0] = arr[1];
			arr[1] = value;
		}
	}

	public static void sortIntArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int f = 0; f < arr.length - 1; f++) {
				if (arr[f] > arr[f + 1]) {
					int value = arr[f];
					arr[f] = arr[f + 1];
					arr[f + 1] = value;
				}
			}
		}
	}

	public static int findMiddle(int[] arr) {
		sortIntArray(arr);
		int value = arr.length / 2;
		return arr[value];
	}
}
