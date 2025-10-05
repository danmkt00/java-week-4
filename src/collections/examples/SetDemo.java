package collections.examples;

import java.util.*;

/**
 * Demonstrates the usage of Set interface in Java.
 *
 * Covers:
 *  - Set operations: union, intersection, difference
 *  - Common methods like add, remove, contains, size, clear
 */
public class SetDemo
{
    public static void main(String[] args)
    {
        // 🔹 1. HashSet: No duplicates, no guaranteed order
        Set<String> fruits = new HashSet<>();

        // add(E e) → Adds element if not already present
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate ignored
        System.out.println("HashSet (unordered): " + fruits);

        // remove(Object o) → Removes element if exists
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // contains(Object o) → Checks existence
        System.out.println("Contains Orange? " + fruits.contains("Orange"));
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // size() → Returns number of elements
        System.out.println("Set size: " + fruits.size());

        // isEmpty() → Checks if set is empty
        System.out.println("Is set empty? " + fruits.isEmpty());

        // 🔹 2. Iterating through the set
        System.out.print("\nIterating with for-each: ");
        for (String fruit : fruits)
        {
            System.out.print(fruit + " ");
        }
        System.out.println();

        System.out.print("Iterating with forEach (lambda): ");
        fruits.forEach(fruit -> System.out.print(fruit + " "));
        System.out.println();

        // 🔹 3. toArray() → Converts Set to Array
        Object[] fruitArray = fruits.toArray();
        System.out.println("Converted to array: " + Arrays.toString(fruitArray));

        // 🔹 4. Set Operations (Union, Intersection, Difference)
        Set<String> tropical = new HashSet<>(Set.of("Mango", "Orange", "Pineapple"));

        // Union → all elements from both sets
        Set<String> union = new HashSet<>(fruits);
        union.addAll(tropical);
        System.out.println("\nUnion: " + union);

        // Intersection → common elements between sets
        Set<String> intersection = new HashSet<>(fruits);
        intersection.retainAll(tropical);
        System.out.println("Intersection: " + intersection);

        // Difference → elements in 'fruits' but not in 'tropical'
        Set<String> difference = new HashSet<>(fruits);
        difference.removeAll(tropical);
        System.out.println("Difference (fruits - tropical): " + difference);

        // 🔹 5. removeIf(Predicate) → Removes based on condition
        union.removeIf(f -> f.startsWith("P"));
        System.out.println("After removing fruits starting with 'P': " + union);

        // 🔹 6. clear() → Removes all elements
        fruits.clear();
        System.out.println("After clearing fruits: " + fruits);
        System.out.println("Is fruits set empty? " + fruits.isEmpty());

    }
}
