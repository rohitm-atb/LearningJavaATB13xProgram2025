package ex19_Oops_Constructor;

public class Lab003_Constructor_Ex03 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);
        c1.name = "TATA";
        System.out.println(c1.name);


        Baby1 b1 = new Baby1();
        System.out.println(b1.name);
    }
}

class Car
{
    String name;
    int year;
    String model;

    Car()
    {
        name = "Audi";
        year = 2010;
        model = "Q6";
    }

}


class Baby1{
    String name;

    Baby1(){
        name = "Baccha";
    }
}
