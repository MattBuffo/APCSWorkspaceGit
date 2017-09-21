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
		
		
		String[] zipBarCodesArray = fillFromLineSeperated(ZipBarCodes, determineSize(ZipBarCodes)); //Initializes arrays containing all line separated strings in each file
		String[] zipCodesArray = fillFromLineSeperated(ZipCodes, determineSize(ZipCodes));
		
		
		System.out.println("Part One: Conversion from Zip codes to Bar Codes\n");
		for(int i = 0; i < zipCodesArray.length; i++) {
			String[] bar = zipToBarCode(zipCodesArray[i], barcodeSegments);
			findCity(ZipCodesCity, zipCodesArray[i], true);
			System.out.print("\t\tReadable Barcode: "); // formatted to match sample
			System.out.print("| ");
			for(String segment : bar) { //for each loops included as I used them briefly in ECS 2 and thus they are old concepts
				System.out.print(segment + " ");
			}
			System.out.println("|");
			
			System.out.print("\t\tPostal Barcode: ");
			System.out.print("|");
			for(String segment : bar) {
				System.out.print(segment + "");
			}
			System.out.println("|\n");
			
			
		}
		
		
		System.out.println("Part Three: Conversion from Barcodes to Zipcodes\n");
	}
	/** Checks to see if the checksum digit plus the other five digits in a zipcode divides by 10 without a remainder
	 * 
	 * @param code 
	 * @return
	 */
	public static boolean checkSum(int[] code) {
		int sum = 0;
		for(int i: code) {
			sum += i;
		}
		if(sum%10 == 0) {
			return true;
		}
		else return false;
	}
	/**Finds and prints the matching cities for a given zipcode
	 * 
	 * @param file assumed to be zipCodesCity.txt, file of all cities and their respective zip codes
	 * @param zipCode the zipcode to be searched for
	 *  
	 */
	public static void findCity(File file, String zipCode, boolean printZipCode)throws FileNotFoundException {
		Scanner cityScan = new Scanner(file); // scanner for zipcodes file
		while(cityScan.hasNextLine()){ //finds matching cities and prints the results for each barcode
			String[] city = cityScan.nextLine().split(",");
			if(zipCode.equals(city[0])) {
				if(printZipCode) {
					System.out.print(zipCode + "   " );
				}
				System.out.println(city[1] + "\t" + city[2]);
			}
		}
		cityScan.close();
	}
	/** Determines the amount of non null line separated strings in a text file
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
		scan.close();
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
		for(int i = 0; i < size; i++) {
			if(fill.hasNextLine()) {	
				array[i] = fill.nextLine(); 
				
			}
		}
		fill.close();
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
	/** Converts a barcode to an array of segments
	 * 
	 * @param code a 32 character barcode
	 * @return array of supplied code split into 5 character elements with the first and last characters removed
	 */
	public static String[] barCodeToArray(String code) {
		String[] array = new String[6]; //6 character zip code
		code = code.substring(1, (code.length())-1); //removes front and end bracing bar
		for(int i = 0; i < 6; i ++) {
			array[i] = code.substring((5*i),(5*i) + 5);
			
		}
		return array;
	}
	/**Converts a barcode segment to integer
	 * 
	 * @param 5 Character barcode segment, assumed to be valid
	 * 
	 * @return Integer value matching barcode segment 
	 * 
	 */
	public static int segmentToInt(String segment){
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
	public static String[] zipToBarCode(String zip, String[] barcodeSegments) {
		String[] bar = new String[zip.length() + 1];
		int sum = 0;
		for(int i = 0; i < zip.length(); i++) {
			sum += charToInt(zip.charAt(i));
			
		}
		if(sum%10>0) zip += (10 - sum%10); // finds checksum by adding all numbers up and finding the digit needed to evenly divide by 10
		else zip += 0;
		for(int i = 0; i < zip.length(); i++) {
			bar[i] = barcodeSegments[charToInt(zip.charAt(i))];
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
