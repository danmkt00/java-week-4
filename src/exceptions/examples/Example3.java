package exceptions.examples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example3
{
    public static void main(String[] args)
    {
        try
        {
            readFile();
        }
        catch (IOException e)
        {
            System.out.println("File error: " + e.getMessage());
        }
    }

    public static void readFile() throws IOException, FileNotFoundException
    {
        FileReader fr = new FileReader("data.txt"); // may throw IOException
    }
}
