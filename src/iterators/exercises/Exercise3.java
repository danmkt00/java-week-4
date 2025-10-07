package iterators.exercises;

import java.util.*;

/**
 * TODO:
 * 1. Create a Set<String> names with several names (e.g. "Ali", "Sara", "Lina", "Amir", "Sami").
 * 2. Use an Iterator to remove all names that start with the letter 'A'.
 * 3. Print the set before and after removal.
 *
 */
public class Exercise3
{
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(List.of("Ali", "Sara", "Lina", "Amir", "Sami"));
        Iterator<String> it = names.iterator();

        System.out.println(names);
        while(it.hasNext())
        {
            if(it.next().toLowerCase().startsWith("a"))
            {
                it.remove();
            }
        }
        System.out.println(names);
    }

}

