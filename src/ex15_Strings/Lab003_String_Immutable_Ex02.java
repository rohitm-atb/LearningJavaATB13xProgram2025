package ex15_Strings;

public class Lab003_String_Immutable_Ex02 {
    public static void main(String[] args) {

        // Two ways created
        String str1 = "Hello";

        str1 = str1.concat(" Team"); // Concat, basically add the value or merge the value in the end.
        System.out.println(str1);
    }
}
