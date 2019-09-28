package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] list = {"october", "yes", "peanut", "book", "wall", "twelve"};
		assertEquals(2,_00_LinearSearch.linearSearch(list, "peanut"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] list = {1, 3, 5, 7, 10, 13};
		assertEquals(2,_01_BinarySearch.binarySearch(list, 0, list.length-1,5));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] list = {10, 20, 30, 40, 50, 60};
		assertEquals(4,_02_InterpolationSearch.interpolationSearch(list, 50));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		String[] list = {""};
		assertEquals(2,_03_ExponentialSearch.exponentialSearch(null, 0));
	}
}
