package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create a List<String> words = ["apple", "banana", "apple", "orange", "banana", "apple"].
 2. Use a Map<String, Integer> to count how many times each word appears.
 3. Print the word counts (e.g., apple → 3, banana → 2, orange → 1).
 */
public class Exercise5
{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "apple"));
        Map<String, Integer> wordAppearance = new HashMap<>();

        for(String word : words)
        {
            wordAppearance.put(word, wordAppearance.getOrDefault(word, 0) + 1);
        }

        System.out.println(words);
        System.out.println(wordAppearance);
    }
}
