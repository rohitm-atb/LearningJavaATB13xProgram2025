package ex17_Arrays;

public class Lab010_Array_Sum_Ex09 {

    public static void main(String[] args) {

        int[] marks = {23, 49, 10};
        int sum = 0;

        for (int i = 0; i < marks.length; i++)
        {
        sum = sum + marks[i];

        }
        System.out.println(sum);
    }
}
