package ex25_Oops_Abstract_Class;

public class Lab001_Abstract_Ex01 {
    public static void main(String[] args) {

        car c1 = new car();
        //Father f1 = new Father(); // This is abstract in nature.
        Child child = new Child();
Father f2 = new Child();  // Dynamic Dispatch.
child.loan50K();
    }
}

// This is concreate class
// this doesn't have the abstract methods
class car{

    void done()
    {

    }
}

abstract class Father{
    // This is called the abstract function.
    abstract void loan50K();

    void loan25K()
    {
        System.out.println("Given the Loan");

    }
}

class Child extends Father{

    @Override
    void loan50K() {
        System.out.println("Given the Loan 50K");
    }
}