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
		String[] zipBarCodesArray = fillFromLineSeperated(ZipBarCodes, determineSize(ZipBarCodes));
		String[] zipCodesCityArray = fillFromLineSeperated(ZipCodesCity, determineSize(ZipCodesCity));
		String[] zipCodesArray = fillFromLineSeperated(ZipCodes, determineSize(ZipBarCodes));
		System.out.println(charToInt('0'));
	}
	/** Determines the amount of line separated strings in a text file
	 * 
	 * @param file
	 * 			a text file
	 * @return
	 * 			the number of space line seperated strings in the file
	 * @throws FileNotFoundException
	 */
	public static int determineSize(File file) throws FileNotFoundException {
		Scanner scan = new Scanner(file);
		int size = 0;
		while(scan.hasNextLine()) {
			scan.nextLine();
			size ++;
		}
		return size;
	}
	/**
	 * 
	 * @param file
	 * 			A text file
	 * @param size
	 * 			The ammount of line seperated strings in the file 
	 * @return Array of each line seperated string in the file
	 * @throws FileNotFoundException
	 */
	public static String[] fillFromLineSeperated(File file, int size) throws FileNotFoundException{
		Scanner fill = new Scanner(file);
		String[] array = new String[size];
		System.out.println();
		System.out.println(size);
		System.out.println();
		for(int i = 0; i < size; i++) {
			if()
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
	/**Converts a zip code to an array of barcode segments without framing bars
	 * 
	 * @param zip
	 * 			a zip code string assumed to be composed of 
	 * @param barcodeSegments
	 * @return
	 */
	public static String[] zipToBarCode(String zip, String[]barcodeSegments) {
		String[] bar = new String[zip.length()];
		for(int i = 0; i < zip.length(); i++) {
			// char does not cast to int well
		}
		return bar; 
	}
	/**
	 * Converts a character variable that is assumed to be a digit to a integer 
	 * @param c a character variable containing the a single integer digit value
	 * @return the corresponding digit, -1 if not a digit
	 */
	public static int charToInt(char c) {
		switch(c) {
		case  '0': return 0;
		case  '1': return 1;
		case  '2': return 2;
		case  '3': return 3;
		case  '4': return 4;
		case  '5': return 5;
		case  '6': return 6;
		case  '7': return 7;
		case  '8': return 8;
		case  '9': return 9;
		default: return -1;
		}
	}
}
