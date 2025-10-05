package collections.examples;

import java.util.*;

/**
 * Demonstrates all major Map interface methods using HashMap.
 *
 * Covers:
 *  - Adding, updating, and removing entries
 *  - Checking existence (keys/values)
 *  - Iterating in different ways
 *  - Safe access and default values
 */
public class MapDemo
{
    public static void main(String[] args)
    {
        //  1. Create a HashMap (key = String, value = Integer)
        Map<String, Integer> ages = new HashMap<>();

        //  2. put(key, value) → Adds or updates a key-value pair
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 20);
        System.out.println("All ages: " + ages); // {Alice=25, Bob=30, Charlie=20}

        //  3. get(key) → Retrieves value by key
        System.out.println("Alice's age: " + ages.get("Alice"));

        //  4. remove(key) → Removes entry by key
        ages.remove("Bob");
        System.out.println("After removing Bob: " + ages);

        //  5. put(key, value) again → Updates value (overwrites if key exists)
        ages.put("Alice", 26);
        System.out.println("After updating Alice's age: " + ages);

        //  6. putIfAbsent(key, value) → Adds only if key not already present
        ages.putIfAbsent("Charlie", 22); // won't overwrite
        ages.putIfAbsent("David", 40);   // new entry
        System.out.println("After putIfAbsent: " + ages);

        //  7. containsKey() & containsValue()
        System.out.println("Contains key 'Alice'? " + ages.containsKey("Alice"));
        System.out.println("Contains value 40? " + ages.containsValue(40));

        //  8. getOrDefault(key, defaultValue) → Returns default if key missing
        System.out.println("Eve's age (default): " + ages.getOrDefault("Eve", -1));

        //  9. size() & isEmpty()
        System.out.println("Map size: " + ages.size());
        System.out.println("Is map empty? " + ages.isEmpty());

        //  10. remove(key, value) → Removes only if both match
        boolean removed = ages.remove("Charlie", 20); // false because value doesn’t match
        System.out.println("Attempted remove (Charlie,20): " + removed);
        System.out.println("After conditional remove: " + ages);

        //  11. replace(key, value) → Replaces value if key exists
        ages.replace("Charlie", 25);
        System.out.println("After replacing Charlie's age: " + ages);

        //  12. replaceAll(BiFunction) → Updates all values
        ages.replaceAll((name, age) -> age + 1); // increment everyone’s age
        System.out.println("After replaceAll (incremented): " + ages);

        //  13. computeIfPresent(key, function) → Recomputes existing key
        ages.computeIfPresent("Alice", (k, v) -> v + 2); // Alice gets +2
        System.out.println("After computing Alice's age: " + ages);

        //  14. keySet(), values(), entrySet() → Different views of the map

        System.out.println("\nIterating over keys (keySet):");
        for (String name : ages.keySet())
        {
            System.out.println(name + " → " + ages.get(name));
        }

        System.out.println("\nIterating over values (values):");
        for (Integer age : ages.values())
        {
            System.out.println("Age: " + age);
        }

        System.out.println("\nIterating over entries (entrySet):");
        for (Map.Entry<String, Integer> entry : ages.entrySet())
        {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old");
        }

        //  15. forEach(BiConsumer) → Functional iteration (Java 8+)
        System.out.println("\nIterating using forEach (lambda):");
        ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));


        //  16. equals() → Compares two maps
        Map<String, Integer> copy = new HashMap<>(ages);
        System.out.println("\nMaps are equal? " + ages.equals(copy));

        //  17. clear() → Removes all entries
        ages.clear();
        System.out.println("\nAfter clearing map: " + ages);
        System.out.println("Is map empty now? " + ages.isEmpty());
    }
}
