package Task_Program_HW;

public class Lab025_Matrix_Diagonal_Sum {

    public static void main(String[] args) {

        int i, sum = 0;

        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for(i = 0; i < arr.length ; i++)
        {
            System.out.format("\nThe Matrix Item at " + i + "," + i +
                    " position = " + arr[i][i]);
            sum = sum + arr[i][i];
        }
        System.out.println("\nThe Sum of the Matrix Diagonal Items = " + sum);
    }
}
