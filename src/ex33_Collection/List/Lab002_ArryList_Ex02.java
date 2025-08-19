package ex33_Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Lab002_ArryList_Ex02 {
    public static void main(String[] args) {

        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}

