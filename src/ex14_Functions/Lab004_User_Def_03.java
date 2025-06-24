package ex14_Functions;

public class Lab004_User_Def_03 {

    public static void main(String[] args) {

        int result = sum_of_num(3,6);
        System.out.println(result);

        sum_of_num1(20,5);
    }

    static int sum_of_num (int a, int b)
    {
        return  a + b;
    }

    static void sum_of_num1 (int x, int y)
    {
        System.out.println(x+y);
    }
}
