package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				int x = array[j];
				int y = array[j+1];
				if (x>y) {
					y = array[j];
					array[j]= array[j+1];
					array[j+1]=y;
					display.updateDisplay();
				}
			}
		}
	}
	
}
