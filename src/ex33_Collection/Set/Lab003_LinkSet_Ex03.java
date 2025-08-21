package ex33_Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab003_LinkSet_Ex03 {
    public static void main(String[] args) {
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        Set lhs = new LinkedHashSet();

        lhs.add("Apple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());
    }
}
