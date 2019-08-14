
/**
 * Write a description of class Writer here.
 * 
 * @author Coglianese 
 * @version (a version number or a date)
 */

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Writer
{
    public static void main(String[] args) throws IOException 
    {
        FileWriter outputStream = null;

        try {
            outputStream = new FileWriter("example.txt");
            BufferedWriter outputBuffer = new BufferedWriter(outputStream);
            PrintWriter outFile = new PrintWriter(outputBuffer);
            outFile.println("All this for one line!");
            outFile.flush();
            outFile.close();

          
        } finally {
            
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
