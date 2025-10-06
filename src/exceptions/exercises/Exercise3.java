package exceptions.exercises;

/**
 * Exercise 3:
 * Ask the user to enter a number.
 * Convert the input from String to int using Integer.parseInt().
 * Catch NumberFormatException if the user enters invalid input.
 */

import java.util.Scanner;

public class Exercise3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int input = Integer.parseInt(sc.next());
        }catch (NumberFormatException e)
        {
            System.out.println("Invalid input");
        }

    }
}
