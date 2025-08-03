package ex31_Exceptions;

public class Lab003_Excp_Ex03 {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("ARE YOU FOOL");
        }
        System.out.println("2");
    }
}
