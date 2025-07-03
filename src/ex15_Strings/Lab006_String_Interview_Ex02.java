package ex15_Strings;

public class Lab006_String_Interview_Ex02 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        // == -> Comparsion -> String -> this check the locations ref.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        // equals ( content) -> value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));

        //  equalsIgnoreCase

        System.out.println(s3.equalsIgnoreCase(s5));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value

    }
}
