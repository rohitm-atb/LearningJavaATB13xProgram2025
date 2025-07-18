package ex18_Oops;

public class Lab003_Oops_Ex02 {

    public static void main(String[] args) {

        Cat c = new Cat();
        c.running();

        new Cat();

        new Cat().running();
    }

}

class Cat
{

    String name;

    void running()
    {
        System.out.println("Running");
    }
}
