package ex33_Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab002_HashSet_Ex02 {

    public static void main(String[] args) {
// Hashing mechanism to store the element
        // no order maintained
        // no duplicates
        // e1 -> hashcode (xyz), e2 -> hashcode -> abc

        Set <String> hs = new HashSet();

        hs.add("Apple");
        hs.add("Mango");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        //hs.add(123);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        for (String s : hs){
            System.out.println(s);
        }
        System.out.println(" ---------------------------");

        // Iterator
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
