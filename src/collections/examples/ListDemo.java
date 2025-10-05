package collections.examples;

import java.util.*;

/**
 * Demonstrates all major List interface methods using ArrayList.
 *
 * Covers:
 *  - Adding, inserting, replacing, and removing elements
 *  - Searching and indexing
 *  - Checking size, emptiness, and membership
 *  - Iterating in multiple ways
 *  - Converting to arrays
 *  - Comparing and clearing lists
 *  - Sorting and reversing (Collections utility methods)
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        // Create a new ArrayList of Strings
        List<String> names = new ArrayList<>();

        //  1. add(E element) → Adds element to the end of the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // duplicates allowed
        System.out.println("All names: " + names); // [Alice, Bob, Charlie, Alice]

        //  2. add(int index, E element) → Inserts element at specific position
        names.add(1, "David");
        System.out.println("After inserting David at index 1: " + names); // [Alice, David, Bob, Charlie, Alice]

        //  3. get(int index) → Returns element at the given index
        System.out.println("Element at index 2: " + names.get(2)); // Bob

        //  4. set(int index, E element) → Replaces element at given index
        names.set(0, "Eve");
        System.out.println("After replacing first element with Eve: " + names);

        //  5. remove(Object o) → Removes the first occurrence of an element
        names.remove("Charlie");
        System.out.println("After removing Charlie: " + names);

        //  6. remove(int index) → Removes element at given index
        names.remove(1);
        System.out.println("After removing index 1: " + names);

        //  7. contains(Object o) → Checks if element exists in list
        System.out.println("Contains Alice? " + names.contains("Alice"));
        System.out.println("Contains Bob? " + names.contains("Bob"));

        //  8. size() → Returns number of elements
        System.out.println("List size: " + names.size());

        //  9. isEmpty() → Checks if list is empty
        System.out.println("Is list empty? " + names.isEmpty());

        //  10. indexOf(Object o) → Returns first index of element (or -1 if not found)
        System.out.println("Index of Alice: " + names.indexOf("Alice"));

        //  11. lastIndexOf(Object o) → Returns last index of element
        names.add("Alice");
        System.out.println("List after adding another Alice: " + names);
        System.out.println("Last index of Alice: " + names.lastIndexOf("Alice"));

        //  12. subList(fromIndex, toIndex) → Returns a portion of the list
        List<String> subList = names.subList(0, 2);
        System.out.println("Sublist (0–2): " + subList);

        //  13. addAll(Collection<? extends E> c) → Adds all elements from another list
        List<String> extra = Arrays.asList("Tom", "Jerry");
        names.addAll(extra);
        System.out.println("After adding another list: " + names);

        //  14. removeAll(Collection<?> c) → Removes all elements in the given collection
        names.removeAll(Arrays.asList("Alice", "Tom"));
        System.out.println("After removing Alice and Tom: " + names);

        //  15. retainAll(Collection<?> c) → Keeps only elements that exist in another list
        names.retainAll(Arrays.asList("Eve", "Jerry"));
        System.out.println("After retaining Eve and Jerry: " + names);

        //  16. clear() → Removes all elements
        names.clear();
        System.out.println("After clearing list: " + names);
        System.out.println("Is list empty now? " + names.isEmpty());

        // Re-populate list for iteration examples
        names.addAll(List.of("Anna", "Brian", "Clara", "Daniel"));

        //  17. Iterating – for loop
        System.out.print("Iterating (for loop): ");
        for (int i = 0; i < names.size(); i++)
        {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        //  18. Iterating – for-each loop
        System.out.print("Iterating (for-each): ");
        for (String name : names)
        {
            System.out.print(name + " ");
        }
        System.out.println();

        //  19. Iterating – forEach() with lambda
        System.out.print("Iterating (lambda): ");
        names.forEach(n -> System.out.print(n + " "));
        System.out.println();

        //  20. toArray() → Converts List to array
        Object[] array = names.toArray();
        System.out.println("Converted to Object array: " + Arrays.toString(array));

        //  21. sort(Comparator) → Sorts the list (using Collections utility)
        Collections.sort(names);
        System.out.println("Sorted list: " + names);

        //  22. reverse() → Reverses the list
        Collections.reverse(names);
        System.out.println("Reversed list: " + names);

        //  23. equals(Object o) → Compares two lists for equality
        List<String> anotherList = new ArrayList<>(names);
        System.out.println("Lists are equal? " + names.equals(anotherList));

        //  24. clone() (via copy constructor or addAll)
        List<String> copy = new ArrayList<>(names);
        System.out.println("Cloned list: " + copy);

        //  25. removeIf(Predicate) → Removes elements matching condition (Java 8+)
        names.removeIf(n -> n.startsWith("D"));
        System.out.println("After removing names starting with D: " + names);
    }
}
