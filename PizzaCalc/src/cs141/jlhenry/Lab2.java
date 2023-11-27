/**
 * 
 */
package cs141.jlhenry;
import java.util.Scanner;
/**
 * @author jlhenry2
 *
 */
public class Lab2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inch10;
		double inch12;
		double inch14;
		double final10;
		double final12;
		double final14;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter the price per square inch of a pizza(as a decimal/floating-point value):");
		
		double squareInch = scnr.nextDouble();
				
		System.out.println("Please enter the tax rate(as a decimal/floating-point value):");
		
		double taxRate = scnr.nextDouble();
		
		inch10 = 25 * Math.PI * squareInch;
		inch12 = 36 * Math.PI * squareInch;
		inch14 = 49 * Math.PI * squareInch;
		
		taxRate = taxRate/100;
		
		final10 = (taxRate * inch10) + inch10;
		final12 = (taxRate * inch12) + inch12;
		final14 = (taxRate * inch14) + inch14;
		
		
		
		System.out.format("The price of the 10 inch pizza is %.2f\n", final10);
		System.out.format("The price of the 12 inch pizza is %.2f\n", final12);		
		System.out.format("The price of the 14 inch pizza is %.2f\n", final14);
	}

}
