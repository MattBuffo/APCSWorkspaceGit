
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
		quickRecur(array, 0, array.length -1);
		return array;
	}
	public static void quickRecur(int[] array, int start, int end) {
		if(start < end) {
			int middle = partialSort(array, start, end);
			quickRecur(array, start, middle);
			quickRecur(array, middle + 1, end);
		}
	}
	public static int partialSort(int[] array, int start, int end) {
		int pivot = array[start];
		int i = start - 1;
		int j = end + 1;
		while(true) {
			i ++;
			while(array[i] < pivot) {
				i ++;
			}
			j --;
			while(array[j] > pivot) {
				j --;
			}
			if(i < j) {
				sort.swap(array, i, j);
			}
			else return j;
		}
	}
	public static int[] mergeSort(int[] array) {
		partition(array, 0, array.length -1);
		return array;
	}
	public static void partition(int[] array, int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			partition(array, start, middle);
			partition(array,middle + 1,end);
			merge(array,start,middle,end);
		}
		
	}
	public static void merge(int[] array, int start, int middle, int end) {
		
		int[] tempArray = new int[end - start + 1];
	
		int lower = start;
		int upper = middle + 1;
		
		int tempArrayIndex = 0;
		while(lower <= middle && middle <= end) {
			if(array[lower] < array[upper]) {
				
				tempArray[tempArrayIndex] = array[lower];
				lower ++;
				
			}
			else {
				tempArray[tempArrayIndex] = array[upper];
				
				upper ++;
				
			}
			System.out.println(tempArrayIndex);
			System.out.println(tempArray[tempArrayIndex]);
			tempArrayIndex ++;
			
			
		}
		while(lower <= middle) {
			tempArray[tempArrayIndex] = array[lower];
			lower ++;
			tempArrayIndex ++;
		}
		while(upper <= end) {
			tempArray[tempArrayIndex] = array[upper];
			upper ++;
			tempArrayIndex ++;
		}
		for(int i = 0; i < tempArray.length; i++) {
			array[start + i] = tempArray[i];
		}
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
