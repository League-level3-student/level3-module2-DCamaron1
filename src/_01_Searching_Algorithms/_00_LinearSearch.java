package _01_Searching_Algorithms;

public class _00_LinearSearch {
	public static int linearSearch(String[] words, String value) {
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
}
