package ex19_Oops_Constructor;

public class Lab006_PM_Const_Ex06 {

    public static void main(String[] args) {

        Person1 p1 = new Person1("Adesh",97654321,"abc");
        System.out.println(p1.name);

        Person1 p2 = new Person1("Sandesh",98989898,"XYZ");

        Person1 p3  = new Person1();
        p3.name = "Smita";
        System.out.println(p3.name);

        Person1 p4 = new Person1("Swapnil",823424242);
        System.out.println(p4.address);


        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}

class Person1
{
    String name;
    long phone;
    String address;

    Person1(){

    }

    Person1(String name_user,long phone_user,String address_user) {
        this.name = name_user;
        this.address = address_user;
        this.phone = phone_user;
    }

    Person1(String name_arg,long phone_arg){
        this.name = name_arg;
        this.phone = phone_arg;

    }

    void eat(){
        System.out.println(this.name + " is eating!");
    }
}
