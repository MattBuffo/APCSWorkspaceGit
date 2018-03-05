import java.util.ArrayList;
import java.util.Arrays;
public class testClient {
	public static void main(String[] args) {
		int[] array = {2,-3,1,4};
		
		int[] arrayTemp = sort.insertionSort(array);
		for(int i: arrayTemp) {
			System.out.println(i);
		}
	}
	public static int[] largestSequence(int[] array) {
		
		int[] sortedArray = sort.selectionSort(array);
		
		if(sortedArray[sortedArray.length -1] < 0) {
			return null;
		}
		else if(array[0] < 0){
			return largestSequence(Arrays.copyOfRange(array, 1, array.length - 1));
		}
		else if(array[array.length -1] < 0) {
			return largestSequence(Arrays.copyOfRange(array, 0, array.length - 2));
		}
		else {
			int tempSum = 0;
			for(int i = 0; i < array.length; i ++) {
				tempSum += array[i];
				if (tempSum <= 0) {
					return largestSequence(Arrays.copyOfRange(array, i, array.length - 1));
				}
			}
			return array;
		}
	}
}
