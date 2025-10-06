package exceptions.exercises;

/**
 * Exercise 1:
 * Ask the user to input two numbers.
 * Divides two numbers.
 * Catch ArithmeticException when dividing by zero.
 * Print a friendly error message like "Cannot divide by zero!".
 */

import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try
        {
            System.out.println(num1 / num2);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero!");
        }


    }
}


