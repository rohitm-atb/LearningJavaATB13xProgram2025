package ex05_TypeCasting;

public class Lab005_TypeCasting_Ex05 {
    public static void main(String[] args) {
int course = 500;
float GST = 18.45f;
//int total = course + GST; // Narrowing Implicit
        int total1 = course+(int)GST;
        System.out.println(total1);

        float total2 = course+GST; // Widening - auto - implicit
        System.out.println(total2);

        float total3 = course+(float)GST; // Widening Explicit
        System.out.println(total3);






    }
}
