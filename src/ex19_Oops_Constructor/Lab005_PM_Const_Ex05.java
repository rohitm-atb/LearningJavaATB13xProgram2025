package ex19_Oops_Constructor;

public class Lab005_PM_Const_Ex05 {

    public static void main(String[] args) {

        Person p1 = new Person("Adesh",97654321,"abc");
        System.out.println(p1.name);
    }
}

class Person
{
    String name;
    long phone;
    String address;


    Person(String name_user,long phone_user,String address_user) {
        this.name = name_user;
        this.address = address_user;
        this.phone = phone_user;
    }
}
