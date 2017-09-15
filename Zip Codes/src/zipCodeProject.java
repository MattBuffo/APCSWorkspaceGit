import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * A program which processes postal zip codes from text files
 *  
 *<ul><li>
 * 		Converts 5 digit zip codes to barcodes 
 *</li><li>
 * 		Finds the matching city(ies) for given zip codes
 *</li><li>
 *		Converts from a series of barcodes to 5 digit zip codes and checks for accuracy with a checksum digit
 *</li></ul>
 * @author Matt Buffo
 * @version September 2017
 *
 */
public class zipCodeProject {


	/**Loads files into arrays, Declares an array of barcodes for each digit,  
	 * Calls other methods for different parts of the project
	 * 
	 */
	public static void main(String[] args) throws FileNotFoundException { 
		String[] barcodeSegments = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
		File ZipCodes = new File("ZipCodes.txt");
		File ZipCodesCity = new File("ZipCodesCity.txt");
		File ZipBarCodes = new File("ZipBarCodes.txt");
		String[] zipCodesArray = fillFromSpaceSeperated(ZipCodes, determineSize(ZipBarCodes));
		String[] zipBarCodesArray = fillFromSpaceSeperated(ZipBarCodes, determineSize(ZipBarCodes));
		String[] zipCodesCityArray = fillFromSpaceSeperated(ZipCodesCity, determineSize(ZipCodesCity));
	}
	/** Determines the amount of space separated strings in a text file
	 * 
	 * @param file
	 * 			a text file
	 * @return
	 * 			the number of space separated strings in the file
	 * @throws FileNotFoundException
	 */
	public static int determineSize(File file) throws FileNotFoundException {
		Scanner scan = new Scanner(file);
		int size = 0;
		while(scan.hasNext()) {
			scan.next();
			size ++;
		}
		return size;
	}
	/**
	 * 
	 * @param file
	 * 			A text file
	 * @param size
	 * 			The ammount of space seperated strings in the file 
	 * @return Array of each space seperated string in the file
	 * @throws FileNotFoundException
	 */
	public static String[] fillFromSpaceSeperated(File file, int size) throws FileNotFoundException{
		Scanner fill = new Scanner(file);
		String[] array = new String[size];
		for(int i = 0; i < size; i++) {
			array[i] = fill.next();
		}
		return array;
	}
	/** Converts a single bar of a barcode segment to a zero or one
	 * @param bar 
	 * 			character to convert, assumed to be '|' or ':'
	 * @return
	 * 			1 if |, 0 if : or any other character
	 */
	public static int barToBinary(char bar) {
		if(bar == '|') {
			return 1;
		}
		else {
			return 0;
		}
	}
	/**Converts a barcode segment to integer
	 * 
	 * @param 5 Character barcode segment
	 * 
	 * @return Integer value matching barcode or -10 if none is found
	 * 
	 */
	public static int segmentToInt(String segment){
		 System.out.println(segment.charAt(0));
		 return 1;
	}
	/**Converts a integer to barcode segment
	 * @param value
	 * 			Integer value between 0 and 9
	 * @param barcodeSegments		
	 * 			Array of barcode segments
	 * @return 5 Character barcode segment or "ERROR" if digit out of range
	 */
	public static String intToSegment(int value, String[] barcodeSegments){
		if(value >= 0 && value <= 9) {
			return barcodeSegments[value];
		}
		else {
			return "ERROR";
		}
	}
	public static zipToBarCode()
}
