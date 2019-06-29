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

	// 1. Complete the method so that the first two elements of the array are
	// swapped
	public static void swapArrayOfTwo(int[] arr) {
		if (arr[0] < arr[1]) {
			int value = arr[0];
			arr[0] = arr[1];
			arr[1] = value;
		}
	}

	// 2. Complete the method so that it sorts the array using a bubble sort.
	// Iterate through the array and when you find two elements that are out
	// of order, swap them. Repeat this until the array is in order.
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

	// 3. Complete the method so that it finds the middle number in the array.
	// *Hint* it helps to sort it first.
	// *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int f = 0; f < arr.length - 1; f++) {
				if (arr[f] > arr[f + 1]) {
					int value = arr[f];
					arr[f] = arr[f + 1];
					arr[f + 1] = value;
				}
			}
		}
		int value = arr.length/2;
		return arr[value];
	}
}
