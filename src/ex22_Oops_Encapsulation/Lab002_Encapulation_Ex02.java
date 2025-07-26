package ex22_Oops_Encapsulation;

//- Encapsulation is a fundamental concept in object-oriented programming (OOP).
//- Bundling of data and methods that operate on that data within a single unit.
//- Data members should be private in nature.
//- Methods with getter and setter only, you can access the data members / attributes.

public class Lab002_Encapulation_Ex02 {

    public static void main(String[] args) {

        ICICIBank ib = new ICICIBank("Rohit",1000);

        long bal1 = ib.getBal();
        System.out.println(bal1);
        ib.setBal(5000,false);
        long bal2 = ib.getBal();
        System.out.println(bal2);
    }

}

class ICICIBank{

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the Bal");
        }
    }
}
