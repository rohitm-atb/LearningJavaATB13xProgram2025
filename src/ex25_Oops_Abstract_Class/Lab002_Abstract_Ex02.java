package ex25_Oops_Abstract_Class;

public class Lab002_Abstract_Ex02 {

    public static void main(String[] args) {
        WagonR car  = new WagonR();
        car.drive();
    }
}

abstract class Engine {

    abstract void startEngine();

    abstract void stopEngine();

    void checkEngine() {
        System.out.println("Everything is Good!");
    }
}

class WagonR extends Engine{
    @Override
    void startEngine() {
        System.out.println("Start Engine!!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop Engine!!");
    }

    void drive()
    {

        checkEngine();
        startEngine();
        stopEngine();
    }

}