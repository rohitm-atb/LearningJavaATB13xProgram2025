package ex33_Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab007_LinkList_Ex03 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // // Arrays Format - Continuous

        List mylist2 = new LinkedList(); // Doubly Linked List.

        mylist2.add("Rohit");
        mylist2.add("M");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("ritwik"));
        System.out.println(mylist2.indexOf("ritwik"));
        System.out.println(mylist2.get(0));

    }
}
