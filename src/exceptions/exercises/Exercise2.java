package exceptions.exercises;

/**
 * Exercise 2:
 * Create an int array with 5 elements.
 * Ask the user for an index to access.
 * Catch ArrayIndexOutOfBoundsException if the index is invalid.
 * Print an appropriate message instead of crashing.
 */

import java.util.Scanner;

public class Exercise2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try (sc) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.print("Index to access: ");
            int index = sc.nextInt();
            System.out.println(arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }


    }
}
