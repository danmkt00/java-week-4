package iterators.exercises;

import java.util.*;

/**
 * TODO:
 * 1. Create a List<Integer> numbers with at least 8 integers.
 * 2. Use an Iterator to remove all even numbers.
 * 3. Print the list before and after removal.
 *
 */
public class Exercise2
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        System.out.println(numbers);

        Iterator<Integer> it = numbers.iterator();

        while(it.hasNext())
        {
            if(it.next() % 2 == 0)
            {
                it.remove();
            }
        }

        System.out.println(numbers);
    }

}
