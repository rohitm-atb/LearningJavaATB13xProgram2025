package ex05_TypeCasting;

public class Lab003_TypeCasting_Ex03 {
    public static void main(String[] args) {

        int val  = 350;
//        byte b = val; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        byte b1 = (byte)val; // Narrowing (int -> byte) - Explicit Casting is allowed.
        // Data Loss.
        System.out.println(b1);



    }
}
