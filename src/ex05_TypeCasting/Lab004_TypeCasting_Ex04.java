package ex05_TypeCasting;

public class Lab004_TypeCasting_Ex04 {
    public static void main(String[] args) {

        long phone_no = 9876543210l;
        //short s = phone_no; // Narrowing - Implicit Casting not allowed
        short s1 = (short) phone_no; // Narrowing - Explicit Casting
        System.out.println(s1);

    }
}
