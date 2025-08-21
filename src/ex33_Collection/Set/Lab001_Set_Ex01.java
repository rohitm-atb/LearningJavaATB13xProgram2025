package ex33_Collection.Set;

import java.util.*;

public class Lab001_Set_Ex01 {

    public static void main(String[] args) {

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Rohit");
        hs.add("Rohit");
        hs.add("Morankar");
        System.out.println(hs);
    }
}
