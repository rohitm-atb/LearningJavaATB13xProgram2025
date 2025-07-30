package Task_Program_HW;

/*2. Bank Interest Calculation
Description: Abstract class Bank with abstract method getInterestRate().
Classes SBI and HDFC implement it.
Expected Output:
SBI Interest Rate: 6.5%
HDFC Interest Rate: 7.0%*/

public class Lab053_AbstractClass_Task02 {
    public static void main(String[] args) {

        Bank s = new SBI();
        s.getInterestRate();
        Bank H = new HDFC();
        H.getInterestRate();

        System.out.println("SBI Interest Rate: " + s.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + H.getInterestRate() + "%");
    }
}

abstract class Bank
{
    abstract double getInterestRate();
}

class SBI extends Bank
{
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}