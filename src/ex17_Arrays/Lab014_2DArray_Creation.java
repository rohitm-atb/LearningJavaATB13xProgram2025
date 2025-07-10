package ex17_Arrays;

public class Lab014_2DArray_Creation {

    public static void main(String[] args) {

        // 1st way to create the array
        int [][] marks = {
                {12, 14, 8},
                {55, 88, 77},
                {27,38,49}
        };

        // 2nd way to create the array
        int [][] marks2 =  new int[][] {
                {10, 20},
                {30, 40},
                {50, 60}
        };

        int [][] arr = new int[2][2];

        arr[0][0] = 23;
        arr[0][1] = 13;
        arr[1][0] = 43;
        arr[1][1] = 63;



    }
}
