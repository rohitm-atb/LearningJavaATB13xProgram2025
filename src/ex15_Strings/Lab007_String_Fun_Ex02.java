package ex15_Strings;

public class Lab007_String_Fun_Ex02 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s3));
    }
}
