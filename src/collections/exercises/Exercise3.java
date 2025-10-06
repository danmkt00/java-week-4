package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create two sets of strings:
 - setA = ["Java", "Python", "C++", "Go"]
 - setB = ["JavaScript", "Python", "Ruby", "Go"]
 2. Find and print:
 - Languages that exist in both sets
 - Languages unique to setA
 - Languages unique to setB
 */
public class Exercise3
{
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>(List.of("Java", "Python", "C++", "Go"));
        Set<String> setB = new HashSet<>(List.of("JavaScript", "Python", "Ruby", "Go"));

        Set<String> both = new HashSet<>(setA);
        both.retainAll(setB);

        System.out.println("Languages that exist in both sets: " + both);

        Set<String> uniqueToA = new HashSet<>(setA);
        uniqueToA.removeAll(setB);
        System.out.println("Languages unique to setA: " + uniqueToA);

        Set<String> uniqueToB = new HashSet<>(setB);
        uniqueToB.removeAll(setA);
        System.out.println("Languages unique to setB: " + uniqueToB);
    }

}
