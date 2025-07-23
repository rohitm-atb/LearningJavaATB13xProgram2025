package ex21_Oops_Polymorphism.MethodOverloading;

public class Lab001_MethodOverloading_Ex01 {

    public static void main(String[] args) {

        MathOverloading m1 = new MathOverloading();

        int result1 = m1.add(4, 5);
        System.out.println(result1);

        int result2 = m1.add(4, 5, 9);
        System.out.println(result2);

        double result3 = m1.add(4.13, 3.15);
        System.out.println(result3);

       String result4 = m1.add("Adesh ", " Sandesh");
        System.out.println(result4);

    }
}

class  MathOverloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

   }
