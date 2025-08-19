package ex33_Collection.List;

import java.util.ArrayList;

public class Lab001_ArryList_Ex01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Rohit");
        arrayList.add(123); // Different data type is allowed.
        arrayList.add(null);
        arrayList.add("Rohit"); // Duplicate is allowed.
        System.out.println(arrayList);

    }
}
