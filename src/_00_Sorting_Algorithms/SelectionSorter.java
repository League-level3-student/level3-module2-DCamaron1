package _00_Sorting_Algorithms;

public class SelectionSorter extends Sorter {
	public SelectionSorter() {
		type = "Selection";
	}

	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
					display.updateDisplay();
				}
			}
			int x = array[index];
			array[index] = array[i];
			array[i] = x;
		}
	}
}
