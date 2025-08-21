package ex33_Collection.Set;

import java.util.*;

public class Lab004_TreeSet_Ex04 {
    public static void main(String[] args) {
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.

        Set ts = new TreeSet();

       ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
        ts.add("Mango");

        System.out.println(ts);

        for(Object o:ts) {
            System.out.println(o);
        }
    }
}
