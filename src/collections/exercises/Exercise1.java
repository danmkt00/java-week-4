package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create a List<String> words containing: "apple", "banana", "kiwi", "strawberry", "pear".
 2. Create a new List<String> longWords that only contains words from the first list with 5 or more letters.
 3. Print both lists.
 */
public class Exercise1
{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("apple","banana","kiwi","strawberry", "pear"));
        List<String> longWords = new ArrayList<>(words);
        longWords.removeIf(word -> word.length() < 5);

        System.out.println("All words: " + words);
        System.out.println("Long words: " + longWords);

    }
}
