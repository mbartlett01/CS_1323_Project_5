// CS 1323 Summer 2020
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
		int[][] testData = createCheckerboard(64, 64, 8);
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
		
		//Return the final array
		return verticalArray; 
	}

	public static int[][] createHorizontalStripes(int height, int width, int stripeWidth) 
	{
		//Create an array to fill in
		int[][] horizontalArray = new int[height][width];
				
		//Loop over each index and determine if it should be black or white
		for(int row = 0; row < height; row++)
		{
			for(int column = 0; column < width; column++)
			{
				if(row % (stripeWidth * 2) < stripeWidth)
				{
					horizontalArray[row][column] = BLACK;
				}
				else
				{
					horizontalArray[row][column] = WHITE;
				}
			}
		}
	
		//Return the final array
		return horizontalArray; 
	}

	public static int[][] createCheckerboard(int height, int width, int stripeWidth) 
	{
		//Create an array to fill in
		int[][] checkerArray = new int[height][width];
				
		//Loop over each index and determine if it should be black or white
		for(int row = 0; row < height; row++)
		{
			for(int column = 0; column < width; column++)
			{
				//Check to see if both the row and column fit the condition or if both the row and column don't fit the column (!XOR)
				if(((column % (stripeWidth * 2) < stripeWidth) && (row % (stripeWidth * 2) < stripeWidth)) || (!(column % (stripeWidth * 2) < stripeWidth) && !(row % (stripeWidth * 2) < stripeWidth)))
				{
					checkerArray[row][column] = BLACK;
				}
				else
				{
					checkerArray[row][column] = WHITE;
				}
			}
		}
				
		//Return the final array
		return checkerArray; 
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
