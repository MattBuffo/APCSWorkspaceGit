
public abstract class sort {
	public static int[] selectionSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int c = i +1; c < array.length; c++) {
				if(array[c] < array[i]) {
					array = sort.swap(array, c, i);
				}
			}
		}
		return array;
	}
	public static int[] bubbleSort(int[] array) {
		boolean madeChanges = true;
		
		for(int startingIndex = 0; startingIndex < array.length; startingIndex ++) {
			while(madeChanges) { // improves execution time
				madeChanges = false;
				for(int index = 0; index < array.length -1; index ++) {
				if(array[index + 1] < array[index]) {
							
					array = sort.swap(array, index, (index+1));
					madeChanges = true;
					}
				}
			}
		}
		return array;
	}
	public static int[] insertionSort(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			int min = array[i];
			int temp = 0;
			for(int c = i +1; c < array.length; c++) {
				if(array[c] < min) {
					min = array[c];
					array[c] = 0;
					temp = c;
				}
			}
			for(int j = temp; j > i; j--) {
				sort.swap(array, j, j-1);
			}
			array[i] = min;
		}
		return array;
	}
	public static int[] quickSort(int[] array) {
		int pivot = (int)(Math.random() * (array.length));
		return null;
	}
	public static int[] mergeSort(int[] array) {
		
	}
	
	/**
	 * Swaps two elements in an integer array
	 * @param array array of integers
	 * @param a index of the array
	 * @param b index of the array
	 * @return swapped array
	 */
	public static int[] swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return array;
	}
	
}
