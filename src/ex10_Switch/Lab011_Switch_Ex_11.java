package ex10_Switch;

public class Lab011_Switch_Ex_11 {
    public static void main(String[] args) {
        char ch = 'b';

        switch (ch)
        {
            default -> System.out.println("Not Match");
            case 'A' -> System.out.println("65");
            case 'B' -> System.out.println("66");

        }
    }
}
