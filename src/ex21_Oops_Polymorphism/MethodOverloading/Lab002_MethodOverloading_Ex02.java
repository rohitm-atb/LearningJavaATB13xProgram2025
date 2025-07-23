package ex21_Oops_Polymorphism.MethodOverloading;

public class Lab002_MethodOverloading_Ex02 {

    public static void main(String[] args) {

        Home h1 = new Home();

        h1.task(5);
        h1.task(true);

        //System.out.println( h1.task(5));

    }
}

class Home {

    void task()
    {
        System.out.println("Task 1");
    }

    int task(int a)
    {
        System.out.println("Task 2");
        return a;
    }

    boolean task (boolean a)
    {
        return false;
    }

   }
