package ex23_Oops_AccessModifier;

public class Lab001_AccMod_Ex01 {

}

class Father
{
    private int gold = 10;
    int car = 1;
    public int bhk2 = 1;
}

class Son extends Father
{
    void weCanUse(){
      //  System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk2);

}

}