package ex26_Oops_Abstract_Interface;

public class Lab002_Abs_Int_Ex02 {

    public static void main(String[] args) {
        Car1 tesla = new Car1();
        tesla.drive();
    }

}


class Car1 implements Brekes, Engine1{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }

    @Override
    public void money() {
        System.out.println("Son has o earn by itSelf!");
    }
}
interface Brekes {
    void applyBreak();
    void money();
}

interface Engine1 {
    void startEngine();
    void money();
    void stopEngine();

    default void completeF1() {
        System.out.println("Default complete function!");
    }
}

