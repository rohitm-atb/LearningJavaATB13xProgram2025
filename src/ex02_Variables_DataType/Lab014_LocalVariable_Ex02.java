package ex02_Variables_DataType;

public class Lab014_LocalVariable_Ex02 {

    public static void main(String[] args) {

        int a = 10;

        {
            int b = 20;
            System.out.println(b);

        }

        int b = 30;

        System.out.println(b);
    }
}
