package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	@Test
	public void testLinearSearch() {
		String[] list = { "october", "yes", "peanut", "book", "wall", "twelve" };
		assertEquals(0, _00_LinearSearch.linearSearch(list, "october"));
		assertEquals(2, _00_LinearSearch.linearSearch(list, "peanut"));
		assertEquals(-1, _00_LinearSearch.linearSearch(list, "kdzgh"));
	}

	@Test
	public void testBinarySearch() {
		int[] list = { 1, 3, 5, 7, 10, 13 };
		assertEquals(0, _01_BinarySearch.binarySearch(list, 0, list.length - 1, 1));
		assertEquals(4, _01_BinarySearch.binarySearch(list, 0, list.length - 1, 10));
		assertEquals(-1, _01_BinarySearch.binarySearch(list, 0, list.length - 1, 12));
	}

	@Test
	public void testInterpolationSearch() {
		int[] list = { 10, 20, 30, 40, 50, 60 };
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(list, 10));
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(list, 50));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(list, 55));
	}

	@Test
	public void testExponentialSearch() {
		int[] list = { 2, 5, 7, 13, 15, 19, 23, 24, 27, 30, 32, 40 };
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(list, 2));
		assertEquals(8, _03_ExponentialSearch.exponentialSearch(list, 27));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(list, 18));
	}
}
