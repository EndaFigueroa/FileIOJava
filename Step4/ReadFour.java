package Step4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    public static void main(String[] args)
    {
    try {
        Scanner fileIn = new Scanner(new File("/Users/efigueroa/Desktop/Projects/FileIOJava/step4/input.txt"));
        PrintWriter fileOut = new PrintWriter("output.txt");
        while (fileIn.hasNext()) {

            String lineIn = fileIn.nextLine();
            String[] input = lineIn.split(" ");
            int sum = 0;
            for (int i = 0; i < input.length; i++) {
                sum += Integer.parseInt(input[i]);
                fileOut.println(sum);
            }
            fileOut.close();
        }
    }
    catch (IOException e) {
        System.out.println("File not found");
        }
    }
}
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */

            // Print out a running total of all the
            // values in the input file.

