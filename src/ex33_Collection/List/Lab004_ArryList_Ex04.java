package ex33_Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Lab004_ArryList_Ex04 {
    public static void main(String[] args) {

        List l = new ArrayList();

        l.add("123");
        l.add("456");
        l.add("1");
        l.add(1);

        // Returns the index of the first occurrence of the specified element in this list,
        System.out.println(l.indexOf("1"));
        System.out.println(l.lastIndexOf("1"));

        System.out.println(l);
        System.out.println(" -----------");

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        System.out.println(" -----------");

        for (Object o: l){
            System.out.println(o);
        }

        l.set(1,25);
        System.out.println(l);

        l.remove(0);  // Remove element at index 0

        System.out.println(l);

        l.clear();
        System.out.println(l);

    }
}
