package ex17_Arrays;

public class Lab012_Array_Find_Element_Linear_Search_Ex11 {

    public static void main(String[] args) {

        int [] arr = {42, 23, 98, 67, 202, 88, 49};

        int target = 202;
        for (int i = 0; i < arr.length; i++) {
            if (target ==arr[i])
            {
                System.out.println(i);
            }

        }
    }
}
