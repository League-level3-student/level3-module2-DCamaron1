package _00_Sorting_Algorithms;

public class MergeSorter extends Sorter {
	public MergeSorter() {
		type = "Merge";
	}

	@Override
	void sort(int[] array, SortingVisualizer display) {
		mergeSort(array, 0, array.length - 1, display);
	}

	private void mergeSort(int[] array, int low, int high, SortingVisualizer display) {
		int[] tempArray = new int[array.length];
		if (low < high) {
			int middle = (high + low) / 2;
			mergeSort(array, low, middle, display);
			mergeSort(array, middle + 1, high, display);
			for (int i = low; i <= high; i++) {
				tempArray[i] = array[i];
			}
			int i = low;
			int j = middle + 1;
			int k = low;

			while (i <= middle && j <= high) {
				if (tempArray[i] <= tempArray[j]) {
					array[k] = tempArray[i];
					i++;
					display.updateDisplay();
				} else {
					array[k] = tempArray[j];
					j++;
					display.updateDisplay();
				}
				k++;
			}

			while (i <= middle) {
				array[k] = tempArray[i];
				k++;
				i++;
				display.updateDisplay();
			}
		}
	}
}
