package iterators.exercises;


import java.util.*;

/**
 * TODO:
 * 1. Create a List<String> animals containing at least 5 animal names.
 * 2. Use a for-each loop to print each animal in uppercase letters.
 * 3. Add a message like: "Animal name: LION"
 * 4. Use an iterator to remove any animal names that contain the letter 'a'.
 * 5. Print the modified list using a for-each loop.
 */

public class Exercise1
{
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(List.of("Dog", "Cat", "Horse", "Lion", "Tiger", "Whale"));

        System.out.println("Use a for-each loop to print each animal in uppercase letters");
        for(String animal : animals)
        {
            System.out.println("Animal name: " + animal.toUpperCase());
        }
        System.out.println();
        Iterator<String> it = animals.iterator();
        while (it.hasNext())
        {
            if(it.next().contains("a"))
            {
                it.remove();
            }
        }

        System.out.println("Removed any animal names that contain the letter 'a'");

        for(String animal : animals)
        {
            System.out.println("Animal name: " + animal);
        }






    }

}


