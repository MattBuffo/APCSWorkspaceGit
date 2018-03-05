/******************************************************************
 * A Project of Sorts
 * 
 * Implements Search Algorithms on integer arrays
 * Includes Linear and Binary searches
 * Binary Search requires a sorted list
 * All Search methods are static
 * All Search helper methods are private
 * 
 * @author 
 *
 *******************************************************************/
public class Search 
{
	/**
	 * Implements a Linear Search
	 *    Compare each element in the array to the target number
	 *    When the target number is found, return the index of the target
	 *    If the target number is not found, return -1
	 * @param list - integer list to search in
	 * @param num - integer to search for
	 * @return index of found item, -1 if not found
	 */
	public static int linearSearch(int[] list, int num)
	{
		for(int i = 0; i < list.length; i++) {
			if(list[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Implements a Binary Search
	 *    Compare the target number to the element halfway through the array
	 *    If the target number is equal to the middle element, return the index of that element
	 *    If the target number is less than the middle element, perform the same function on the sub list of all numbers less than the middle element
	 *    If the target number is greater than the middle element, perform the same function on the upper half of the list 
	 * Pre: list must be sorted
	 * 
	 * @param list - integer list to search in
	 * @param num - integer to search for
	 * @return index of found item, -1 if not found
	 */
	public static int binarySearch(int[] list, int num)
	{
		int listStart = 0;
		int listEnd = list.length - 1;
		while(listStart <= listEnd) {
			int mid = (listStart + listEnd) /2;
			if(list[mid] == num) {
				return mid;
			}
			if(num < list[mid]) {
				listEnd = mid -1;
			}
			else {
				listStart = mid +1;
			}
		}
		return -1;
	}
	
}
