package Task_Program_HW;
/*5. Compare ArrayList vs LinkedList Performance
📘 Description (Updated with Hints):
In this program, you’ll compare how fast Java can add elements to an ArrayList versus a LinkedList.
You will:
Create two separate lists: one ArrayList and one LinkedList.
Add 100,000 numbers (from 0 to 99,999) to each list using a loop.
Use System.currentTimeMillis() to measure how much time it takes to add the elements.
Print the time taken for both lists.
Hint :-
        :-  System.currentTimeMillis() gives you the current time in milliseconds.
        :-  Subtract the end time from the start time to get the duration.
        :-  You don’t need to print all the 100,000 numbers, just print the time taken.

✅ Expected Output:
ArrayList time: 8 ms
LinkedList time: 12 ms*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab078_List_Task05 {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start1 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("LinkedList time: " + (end2 - start2) + " ms");
    }
}
