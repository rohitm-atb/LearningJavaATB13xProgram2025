package ex17_Arrays;

import java.util.Arrays;

public class Lab006_Array_Sort_Ex05 {

    public static void main(String[] args) {

        int[] marks = {51, 72, 44, 67, 80};

        System.out.println("---- Sort the Marks ----");

        Arrays.sort(marks);

        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}
