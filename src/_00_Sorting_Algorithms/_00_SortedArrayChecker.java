package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	public static boolean intArraySorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int a = list[i];
			int b = list[i + 1];
			if (a > b) {
				return false;
			}
		}
		return true;
	}

	public static boolean doubleArraySorted(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			double a = list[i];
			double b = list[i + 1];
			if (a > b) {
				return false;
			}
		}
		return true;
	}

	public static boolean charArraySorted(char[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			char a = list[i];
			char b = list[i + 1];
			if (a > b) {
				return false;
			}
		}
		return true;
	}

	public static boolean stringArraySorted(String[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			String a = list[i];
			String b = list[i + 1];
			if (a.compareTo(b) > 0) {
				return false;
			}
		}
		return true;
	}
}
