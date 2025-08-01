package ex30_Wrapper_Class;

public class Lab002_Wrapper_Ex01 {

    public static void main(String[] args) {

        int w = 10;
        Integer i = w;  // Primitive to wrapper -> AutoBoxing - automatically JVM will store the value
        System.out.println(i);

        Integer b = 46;
        int a = b; // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(a);
    }
}
