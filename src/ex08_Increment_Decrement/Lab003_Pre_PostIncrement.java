package ex08_Increment_Decrement;

public class Lab003_Pre_PostIncrement {

    public static void main(String[] args) {

        //PreIncrement
        int a = 10;
        System.out.println(++a);
        System.out.println(a);

        //PostIncrement

        int a_post = 10;
        int b = a_post++;
        System.out.println(b);
        System.out.println(a_post);
    }
}
