package ex17_Arrays;

public class Lab016_2DArray_Iterate_For_Loop {

    public static void main(String[] args) {

        int[][] arr = {{10,20},{30,40},{50,60}};
        //Row - 2, Col - 2
        // 10 20
        // 30 40
        // 50 60

        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++)
                {
                    for (int j = 0; j <arr[i].length; j++)
                    {
                        System.out.print(arr[i][j] + " | ");
                    }
                    System.out.println();

        }
    }
}
