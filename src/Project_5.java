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

	public static void main(String[] args) throws FileNotFoundException 
	{

		// call all the methods
		int[][] testData = createVerticalStripes(64, 64, 32);
		saveImage("test.pgm", testData);
	}
		

	public static int[][] createVerticalStripes(int height, int width, int stripeWidth) 
	{
		//Create an array to fill in
		int[][] verticalArray = new int[height][width];
		
		//Loop over each index and determine if it should be black or white
		for(int row = 0; row < height; row++)
		{
			for(int column = 0; column < width; column++)
			{
				if(column % (stripeWidth * 2) < stripeWidth)
				{
					verticalArray[row][column] = BLACK;
				}
				else
				{
					verticalArray[row][column] = WHITE;
				}
			}
		}

		return verticalArray; // change null to the actual array
	}

	public static int[][] createHorizontalStripes(int height, int width, int stripeWidth) 
	{

		// in this method you have to write a nested loop to create horizontal stripe pattern

		return null; // change null to the actual array
	}

	public static int[][] createCheckerboard(int height, int width, int stripeWidth) 
	{

		// in this method you have to write a nested loop to create checkerboard stripe pattern
		// keep in mind, the checkerboard should have alternate black & white stripe both
		// horizontally and vertically

		return null;
	}

	public static int[][] createDiagonalStripes(int height, int width, int stripeWidth) 
	{

		// in this method you have to write a nested loop to create diagonal stripe pattern

		return null;
	}

	public static void saveImage(String filename, int[][] image) throws FileNotFoundException 
	{
		//Create the new file and PrintWriter
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		
		//Print the preliminary information
		pw.println("P2");
		int numRows = image.length;
		int numColumns = image[0].length;
		pw.println("" + numColumns + " " + numRows);
		pw.println("255");
		
		//Print the file data
		for(int row = 0; row < numRows; row++)
		{
			for(int column = 0; column < numColumns; column++)
			{
				pw.print(image[row][column] + " ");
			}
			pw.println("");
		}
		
		//Close the PrintWriter
		pw.close();
		
	}
}
