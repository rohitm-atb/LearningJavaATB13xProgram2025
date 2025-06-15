package ex07_UserInput;

public class Lab001_UI {

    public static void main(String[] args) {

        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        String canIvote = (age >= 18) ? "Yes" : "No";
        System.out.println(canIvote);
    }



}