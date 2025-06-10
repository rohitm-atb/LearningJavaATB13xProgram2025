package ex02_Variables_DataType;

public class Lab012_Constants_Ex {

    public static void main(String[] args) {

        System.out.println("Special variable whose value can't be modified during the program execution.");
       final int aa = 200;
        //aa = 202;
        System.out.println(aa);

      final  float PI = 3.14f;
        //PI = 32.22f;
        System.out.println(PI);
    }
}
