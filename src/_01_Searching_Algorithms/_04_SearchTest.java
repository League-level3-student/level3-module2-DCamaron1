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
		String[] list = {"october", "yes", "peanut", "book", "wall", "twelve"};
		assertEquals(2,_00_LinearSearch.binarySearch(list, "peanut"));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		String[] list = {"october", "yes", "peanut", "book", "wall", "twelve"};
		assertEquals(2,_00_LinearSearch.interpolationSearch(list, "peanut"));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		String[] list = {"october", "yes", "peanut", "book", "wall", "twelve"};
		assertEquals(2,_00_LinearSearch.exponentialSearch(list, "peanut"));
	}
}
