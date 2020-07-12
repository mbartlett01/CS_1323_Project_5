// CS 1323 Summer 2020
// This is a template file, you may use this for your code.

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Project_5 {

	/**
	 * do not change these values and make sure to use
	 * black and white instead of their number in the code
	**/
	
	public static final int BLACK = 0;
	public static final int WHITE = 255;

	public static void main(String[] args) throws FileNotFoundException {

		// call all the methods
		File file = new File("test.pgm");
		PrintWriter pw = new PrintWriter(file);
		pw.println("P2");
		pw.println("8 3");
		pw.println("255");
		pw.println("0 0 255 255 0 0 255 255");
		pw.println("0 0 255 255 0 0 255 255");
		pw.println("0 0 255 255 0 0 255 255");
		//P2
		//3 8
		//255
		//0 0 255 255 0 0 255 255
		//0 0 255 255 0 0 255 255
		//0 0 255 255 0 0 255 255

		pw.close();
		
		
	}

	public static int[][] createVerticalStripes(int height, int width, int stripeWidth) {

		// in this method you have to write a nested loop to create vertical stripe pattern

		return null; // change null to the actual array
	}

	public static int[][] createHorizontalStripes(int height, int width, int stripeWidth) {

		// in this method you have to write a nested loop to create horizontal stripe pattern

		return null; // change null to the actual array
	}

	public static int[][] createCheckerboard(int height, int width, int stripeWidth) {

		// in this method you have to write a nested loop to create checkerboard stripe pattern
		// keep in mind, the checkerboard should have alternate black & white stripe both
		// horizontally and vertically

		return null;
	}

	public static int[][] createDiagonalStripes(int height, int width, int stripeWidth) {

		// in this method you have to write a nested loop to create diagonal stripe pattern

		return null;
	}

	public static void saveImage(String filename, int[][] image) throws FileNotFoundException {

		// in this methiod you need to read in the array and write it to the appropriate file name
	}
}
