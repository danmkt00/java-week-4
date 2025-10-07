package iterators.exercises;

import java.util.*;

/**
 * TODO:
 * 1. Create a List<Integer> grades with values (55, 70, 90, 45, 82, 100, 60).
 * 2. Use an Iterator to remove all grades below 60.
 * 3. Calculate the average of the remaining grades using a for-each loop.
 * 4. Print both the filtered list and the average grade.
 */
public class Exercise4
{
    public static void main(String[] args) {
        Exercise4 ex4 = new Exercise4();

        List<Integer> grades = new ArrayList<>(List.of(55, 70, 90, 45, 82, 100, 60));
        Iterator<Integer> it = grades.iterator();

        System.out.println(grades);
        System.out.println(ex4.calculateAverage(grades));

        while(it.hasNext())
        {
            if(it.next() < 60)
            {
                it.remove();
            }
        }

        System.out.println(grades);
        System.out.println(ex4.calculateAverage(grades));

    }

    public double calculateAverage(List<Integer> grades)
    {
        int total = 0;
        for(int grade : grades)
        {
            total+=grade;
        }
        return (double)total / grades.size();
    }
}
