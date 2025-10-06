package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create a Set<Integer> randomNumbers and add 15 random integers between 1 and 20.
 2. Check if the set contains the number 10.
 3. Remove all numbers less than 5.
 4. Print the final set.
 */
public class Exercise4
{
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> randomNumbers = new HashSet<>();

        while(randomNumbers.size() < 15)
        {
            randomNumbers.add(rand.nextInt(20) + 1);
        }

        System.out.println(randomNumbers);

        System.out.println(randomNumbers.contains(10) ? "Set contains 10" : "Set doesn't contain 10");

        randomNumbers.removeIf(number -> number < 5);

        System.out.println(randomNumbers);
    }
}
