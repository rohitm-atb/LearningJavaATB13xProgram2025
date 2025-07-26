package ex24_Oops_Super;

public class Lab002_Super_Ex02 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.sound();
    }
}

class GOD{
    public  int gold = 100;
    void sound(){
        System.out.println("GOD!!");
    }

    GOD(){
        System.out.println("GOD DC");
    }
}

class Animal extends GOD{
    @Override
    void sound() {

        super.sound();
    }
    Animal(){
        super();
    }
    Animal(int a,int b){
        System.out.println(a+b);
    }
    void test(){
        System.out.println(super.gold);
    }
}
