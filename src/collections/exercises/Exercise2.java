package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create two lists of integers:
 - list1: [1, 3, 5, 7, 9]
 - list2: [2, 3, 4, 5, 6]
 2. Combine both into a new list that contains all elements.
 3. Remove duplicates from the combined list.
 4. Sort the final list in ascending order.
 5. Print the final result.
 */
public class Exercise2
{
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 3, 5, 7, 9));
        List<Integer> list2 = new ArrayList<>(List.of(2, 3, 4, 5, 6));

        List<Integer> both = new ArrayList<>(list1);
        both.addAll(list2);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Both: " + both);

        both = new ArrayList<>(new LinkedHashSet<>(both));

        System.out.println("Both - no duplicates: " + both);

        Collections.sort(both);

        System.out.println("Both - sorted: " + both);



    }

}
