package ex06_Ternary_Operator;

public class Lab009_Task_02 {

    public static void main(String[] args) {

        //Check Even or Odd.
       // Uses ternary to check whether a number is even or odd. A = 19, update the a value and check again A =20;

      //  int a = 19;
        int a = 20;
        String result = (a%2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
