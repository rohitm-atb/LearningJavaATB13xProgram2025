package ex32_Generics;

public class Lab002_Gen_Ex02 {

    public static void main(String[] args) {
        display(4,3);
        display(3.14,2.45);
        display("Adesh","Sandesh");

    }

    static <T> T display(T a,T b, T c) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }


    static <T> void display(T a,T b) {
        System.out.println(a);
        System.out.println(b);
    }
}
