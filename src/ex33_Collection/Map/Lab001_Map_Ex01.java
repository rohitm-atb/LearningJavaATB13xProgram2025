package ex33_Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab001_Map_Ex01 {

    public static void main(String[] args) {


        Map m1 = new HashMap(20);
        // Map is key and value pair
        // name -> pramod
        m1.put("name", "Rohit");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
//        m1.put(34,90);
        System.out.println(m1);


        Map m2 = new LinkedHashMap();
        m2.put("name", "Rohit");
        m2.put("rollno", 1);
        m2.put("phone", 987654321);
        System.out.println(m2);


        Map m3 = new TreeMap();
        m3.put("firstname", "Rohit");
        m3.put("lastname", "Morankar");
        m3.put("rollno", 1);
        m3.put("phone", 987654321);
        System.out.println(m3);
    }
}