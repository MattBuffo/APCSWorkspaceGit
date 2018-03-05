/******************************************************************
 * A Project of Sorts
 * 
 * Implements Sort Algorithms on integer arrays
 * Includes Bubble, Insertion, Selection, Merge, and Quick Sorts
 * Merge and Quick Sorts are recursive
 * All Sort methods are static
 * All Sort helper methods are private
 * 
 * @author 
 *
 *******************************************************************/
public class Sort
{
  
  /************************
   * Implements Bubble Sort
   *  1.Scan list and compare adjacent elements
   *  2.Swap if out of order and set a flag
   *  3.Repeat 1-2 until no swaps are made (flag is false)
   *    scanning one less at the end each pass
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void bubbleSort(int[] aSort)
  {
	  boolean madeChanges = true;
		
		for(int startingIndex = 0; startingIndex < aSort.length; startingIndex ++) {
			while(madeChanges) { // improves execution time
				madeChanges = false;
				for(int index = 0; index < aSort.length -1; index ++) {
				if(aSort[index + 1] < aSort[index]) {
							
					aSort = Sort.swap(aSort, index, (index+1));
					madeChanges = true;
					}
				}
			}
		}
  }
  
  /************************
   * Implements Insertion Sort
   *  1.Start with a sorted list of one value
   *  2.Add another value and sort the values, placing in correct location
   *  3.Repeat 2-3 shifting sorted values to the right until it is placed
   *    in the correct position
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void insertionSort(int[] aSort)
  {
	  
	  for(int i = 0; i < aSort.length; i++) {
		  
			int min = aSort[i];
			int temp = i;
			for(int c = i +1; c < aSort.length; c++) {
				if(aSort[c] < min) {
					min = aSort[c];
					temp = c;
					
				}
			}
			
			aSort[temp] = 0;
			for(int j = temp; j > i; j--) {
				aSort[j] = aSort[j-1];
			}
			aSort[i] = min;
		}
	  	
  }
  
  /************************
   * Implements Selection Sort
   *  1.Scan the list to find the smallest value
   *  2.Swap with first position
   *  3.Repeat 1-2 Scanning and swapping with the next position in the list
   *    Until you are at the end of the list
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void selectionSort(int[] aSort)
  {
	  for(int i = 0; i < aSort.length; i++) {
			for(int c = i +1; c < aSort.length; c++) {
				if(aSort[c] < aSort[i]) {
					aSort = Sort.swap(aSort, c, i);
				}
			}
		}
  }
  
  /************************
   * Implements Merge Sort recursively
   *  1.Divide the list in half
   *  2.Sort each half (recursively)
   *  3.Merge the two sorted lists
   *  Note: Use indexes into the array to mark two sublists
   *        and a temporary array when merging
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void mergeSort(int[] aSort)
  {
    //Sort the entire list using a recursive merge sort method
    doMergeSort(aSort, 0, aSort.length-1);
  }
  /************************
   * Recursively partitions an array and then merges the partitions
   * @param array array of integers to sort
   * @param start starting index of partition
   * @param end ending index of partition
   */
  public static void doMergeSort(int[] array, int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			doMergeSort(array, start, middle);
			doMergeSort(array,middle + 1,end);
			merge(array,start,middle,end);
		}
	}
  /************************
   * Merges a set of partitions in an array of integers
   * @param array array of integers to operate on
   * @param start starting index of the first partition
   * @param middle ending index of first partition
   * @param end ending index of second partition
   */
  public static void merge(int[] array, int start, int middle, int end) {
		
		int[] tmp = new int[end - start + 1];
	
		int lower = start;
		int upper = middle + 1;
		int tempArrayIndex = 0;
		
		while(lower <= middle && upper <= end) {
			if(array[lower] < array[upper]) {
				tmp[tempArrayIndex] = array[lower];
				lower ++;
				
			}
			else {
				tmp[tempArrayIndex] = array[upper];
				
				upper ++;
				
			}
			tempArrayIndex ++;
			
			
		}
		while(lower <= middle) {
			tmp[tempArrayIndex] = array[lower];
			lower ++;
			tempArrayIndex ++;
		}
		while(upper <= end) {
			tmp[tempArrayIndex] = array[upper];
			upper ++;
			tempArrayIndex ++;
		}
		for(int i = 0; i < tmp.length; i++) {
			array[start + i] = tmp[i];
		}
	}
  /************************
   * Implements Quick Sort recursively
   *  1.Divide into two sublists, < and > a pivot value
   *  2.Recursively sort each sublist
   *  Use the first element in the list as the pivot
   *  Note: Use indexes into the array to mark two sublists
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void quickSort(int[] aSort)
  {
    //Sort the entire list using the recursive merge sort method
    doQuickSort(aSort, 0, aSort.length-1);
  }
  /************************
   * Recursively sorts an array of integers
   * @param array array of numbers to be sorted
   * @param start starting index of sort
   * @param end ending index of sort
   * Pre: Array must be declared and initalialized with no null elements
   * Post: Array is sorted in ascending order
   */
  public static void doQuickSort(int[] array, int start, int end) {
		if(start < end) {
			int middle = partialSort(array, start, end);
			doQuickSort(array, start, middle);
			doQuickSort(array, middle + 1, end);
		}
	}
  /************************
   * Partially sorts an array by swapping elements greater and less than a pivot
   * @param array
   * @param start
   * @param end
   * @return
   */
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
				Sort.swap(array, i, j);
			}
			else return j;
		}
	}
  /************************
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
