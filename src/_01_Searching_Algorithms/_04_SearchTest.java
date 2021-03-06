package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = {"a", "b", "c"};
		
		assertEquals(1, _00_LinearSearch.linearSearch(words, "b"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "d"));
		assertEquals(0, _00_LinearSearch.linearSearch(words, "a"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
int[] words = {1, 3, 4,5,6};
		
		assertEquals(1, _01_BinarySearch.binarySearch(words, 0, 4, 3));
		assertEquals(2, _01_BinarySearch.binarySearch(words, 0, 4,4));
		assertEquals(-1, _01_BinarySearch.binarySearch(words, 0, 4, 7));
	}
	
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
int[] words = {1,2,3,5,6};
		
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(words, 2));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(words, 9));
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(words, 1));
	
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
int[] words = {1,2,3,5,6};
		
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(words, 2));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(words, 9));
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(words, 1));
	
	}
	
	}

