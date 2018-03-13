
public class Client {
	public static void main(String[] args) {
		System.out.println("Timing of basic sorting tasks:");
		basicTime();
		System.out.println("Timing of sorts in special situations");
		specialSets();
		System.out.println("Timing of search algorithms (milliseconds");
		searchTest();
		
	}
	/**
	 * Tests search algorithms with large data sets
	 */
	public static void searchTest() {
		//linear tests
		StopWatch1 timer;
		int[] array = generateArray(5000000,1,5000000);
		System.out.printf("%15s%10s%10s%10s%10s%10s%n","Size","Sort Type","Pre-sort","Value","Index","Time");
		for(int i = 0; i< 5; i++) {
			timer = new StopWatch1();
			int temp = (int)(Math.random() * (5000000)) +1;
			System.out.printf("%15d%10s%10s%10d",5000000,"Linear","Random",temp);
			timer.start();
			int result = Search.linearSearch(array, temp);
			timer.stop();
			if(result>0) {
				System.out.printf("%10d",result);
			}
			else {
				System.out.printf("%10s","Not Found");
			}
			System.out.printf("%10d%n", timer.getElapsedTime());
			
		}
		Sort.mergeSort(array);
		for(int i = 0; i< 5; i++) {
			timer = new StopWatch1();
			int temp = (int)(Math.random() * (5000000)) +1;
			System.out.printf("%15d%10s%10s%10d",5000000,"Linear","Sorted",temp);
			int result = Search.linearSearch(array, temp);
			if(result>0) {
				System.out.printf("%10d",result);
			}
			else {
				System.out.printf("%10s","Not Found");
			}
			System.out.printf("%10d%n", timer.getElapsedTime());
		}
		for(int i =0; i< 5; i++) {
			timer = new StopWatch1();
			int temp = (int)(Math.random() * (5000000)) +1;
			System.out.printf("%15d%10s%10s%10d",5000000,"Binary","Sorted",temp);
			int result = Search.binarySearch(array, temp);
			if(result>0) {
				System.out.printf("%10d",result);
			}
			else {
				System.out.printf("%10s","Not Found");
			}
			System.out.printf("%10d%n", timer.getElapsedTime());
		}
	}
	/**
	 * Tests algorithms with special sets of data for all algos except bubble
	 */
	public static void specialSets() {
		System.out.printf("%12s%15s%15s%10s%10s%10s%10s%n","Size","Range","Pre-Sort Type","Insertion","Selectuon","Quick","Merge");
		int[] array;
		//200K
		System.out.printf("%12d%15s%15s",200000,"1-200k","N/A");
		array = generateArray(200000, 1, 200000);
		fourSorts(array);
		System.out.println();
		//Sorted array
		System.out.printf("%12d%15s%15s",200000,"1-200k","Sorted");
		fourSorts(array);
		System.out.println();
		//Reverse Sorted
		System.out.printf("%12d%15s%15s",200000,"1-200k","Reverse Sorted");
		int[] temp = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			temp[i] = array[array.length -1 -i];
		}
		fourSorts(temp);
		System.out.println();
		//Range 1-20
		System.out.printf("%12d%15s%15s",200000,"1-20","N/A");
		array = generateArray(200000, 1, 20);
		fourSorts(array);
		System.out.println();
	}
	/**
	 * Prints the time it takes to sort datasets of varying sizes according to varying search methods
	 */
	public static void basicTime(){	
		int[] array;
		//Basic sort timings
		System.out.printf("%12s%10s%10s%10s%10s%10s%n", "Size", "Bubble", "Insertion", "Selection", "Quick", "Merge");
		//1K
		array = generateArray(1000, 0, 1000);
		allSorts(array);
		//5K
		array = generateArray(5000, 0, 5000);
		allSorts(array);
		//10K
		array = generateArray(10000, 0, 10000);
		allSorts(array);
		//50K
		array = generateArray(50000, 0, 50000);
		allSorts(array);
		//100K
		System.out.printf("%12d%10s",100000,"N/A");
		array = generateArray(100000, 0, 100000);
		fourSorts(array);
		System.out.println();
		//500K
		System.out.printf("%12d%10s",500000,"N/A");
		array = generateArray(500000, 0, 500000);
		fourSorts(array);
		System.out.println();
		//1M
		System.out.printf("%12d%10s%10s%10s",1000000,"N/A", "N/A", "N/A");
		array = generateArray(1000000, 0, 1000000);
		//Performs quick sort
		StopWatch1 timer;
		int[] temp;
		timer = new StopWatch1();
		temp = copyArray(array);
		timer.start();
		Sort.quickSort(temp);
		timer.stop();
		System.out.printf("%10d",timer.getElapsedTime());
		
		
		//Performs merge sort
		timer = new StopWatch1();
		temp = copyArray(array);
		timer.start();
		Sort.mergeSort(temp);
		timer.stop();
		System.out.printf("%10d",timer.getElapsedTime());
		System.out.println();
		//5M
		array = generateArray(5000000, 0, 5000000);
		System.out.printf("%12d%10s%10s%10s",5000000,"N/A", "N/A", "N/A");
		//Performs quick sort
		timer = new StopWatch1();
		temp = copyArray(array);
		timer.start();
		Sort.quickSort(temp);
		timer.stop();
		System.out.printf("%10d",timer.getElapsedTime());

		//Performs merge sort
		timer = new StopWatch1();
		temp = copyArray(array);
		timer.start();
		Sort.mergeSort(temp);
		timer.stop();
		System.out.printf("%10d",timer.getElapsedTime());
		System.out.println();
	}
	/**
	 * Performs a test of core sort and search functionalities
	 */
	public static void testAlgos() {
		int[] array;
		//Test of sorts and searches
		int[] arrayTest = generateArray(20, -20, 20);
		//Bubble Sort
		array = copyArray(arrayTest);
		Sort.bubbleSort(array);
		System.out.println("Bubble Sorted Array:");
		printArray(array);
		//Selection Sort
		array = copyArray(arrayTest);
		Sort.selectionSort(array);
		System.out.println("Selection Sorted Array:");
		printArray(array);
		//Insertion Sort
		array = copyArray(arrayTest);
		Sort.insertionSort(array);
		System.out.println("Insertion Sorted Array:");
		printArray(array);
		//Quick Sort
		array = copyArray(arrayTest);
		Sort.quickSort(array);
		System.out.println("Quick Sorted Array:");
		printArray(array);
		//Merge Sort
		array = copyArray(arrayTest);
		Sort.mergeSort(array);
		System.out.println("Merge Sorted Array:");
		printArray(array);
		//Test of linear search on sorted array
		System.out.printf("%6s%6s%20s%20s%n", "Value", "Index","Linear Result","Binary Result");
		System.out.printf("%6d%6d%20d%20d%n", array[2], 2, Search.linearSearch(array, array[2]),Search.binarySearch(array, array[2]));
		System.out.printf("%6d%6d%20d%20d%n", array[5], 5, Search.linearSearch(array, array[5]),Search.binarySearch(array, array[5]));
		System.out.printf("%6d%6d%20d%20d%n", array[17], 17, Search.linearSearch(array, array[17]),Search.binarySearch(array, array[17]));
		System.out.printf("%6d%6d%20d%20d%n", -40, -1, Search.linearSearch(array, -40),Search.binarySearch(array, -40));
	}
	/**
	 * Generates an array of integers filled with random numbers in a given range
	 * @param size size of the array to generate
	 * @param startRange start value of the range (inclusive)
	 * @param endRange end value of the range (inclusive)
	 * @return filled array
	 */
	private static int[] generateArray(int size, int startRange, int endRange) {
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)((Math.random()*(endRange - startRange + 1)) + startRange);
		}
		return array;
	}
	/**
	 * Runs all five sorts on a given array of integers
	 * @param array integer array
	 * @return complex string representing the time it took to perform each sort
	 */
	private static void allSorts(int[] array) {
		System.out.printf("%12d",array.length);
		int[] temp;
		StopWatch1 timer;
		
		//Performs bubble sort
		timer = new StopWatch1();
		temp = copyArray(array);
		timer.start();
		Sort.bubbleSort(temp);
		timer.stop();
		System.out.printf("%10d",timer.getElapsedTime());
		fourSorts(array);
		System.out.println();
	}
	/**
	 * Sorts an array with timings for all sorts except bubble sort
	 * @param array integer array
	 */
	private static void fourSorts(int[] array) {
		StopWatch1 timer;
		int[] temp;
		//Performs insertion sort
		timer = new StopWatch1();
		temp = copyArray(array);
		timer.start();
		Sort.insertionSort(temp);
		timer.stop();
		System.out.printf("%10d",timer.getElapsedTime());


		//Performs selection sort
		timer = new StopWatch1();
		temp = copyArray(array);
		timer.start();
		Sort.selectionSort(temp);
		timer.stop();
		System.out.printf("%10d",timer.getElapsedTime());

		//Performs quick sort
		timer = new StopWatch1();
		temp = copyArray(array);
		timer.start();
		Sort.quickSort(temp);
		timer.stop();
		System.out.printf("%10d",timer.getElapsedTime());

		//Performs merge sort
		timer = new StopWatch1();
		temp = copyArray(array);
		timer.start();
		Sort.mergeSort(temp);
		timer.stop();
		System.out.printf("%10d",timer.getElapsedTime());

	}
	/** Copies an array of integers and returns a copy
	 * 
	 * @param array integer array to copy
	 * @return copied array
	 */
	private static int[] copyArray(int[] array) {
		int[] copy = new int[array.length]; 
		for(int i = 0; i < array.length; i ++) {
			copy[i] = array[i];
		}
		return copy;
	}
	/**
	 * Prints out an array of integers
	 * @param array integer array
	 * 
	 */
	private static void printArray(int[] array) {
		for(int i: array) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
