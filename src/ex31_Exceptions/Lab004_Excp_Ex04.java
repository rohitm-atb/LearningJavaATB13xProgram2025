package ex31_Exceptions;

public class Lab004_Excp_Ex04 {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("ARE YOU FOOL");
        }catch (Exception e){
            System.out.println("Are you Fool Too");
        }
        System.out.println("2");
    }
}
