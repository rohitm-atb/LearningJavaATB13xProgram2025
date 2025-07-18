package ex19_Oops_Constructor;

public class Lab004_PM_Const_Ex04 {

    public static void main(String[] args) {

        BabyA b1 = new BabyA();
        System.out.println(b1.name);

        BabyA b2 = new BabyA("Adesh","13454323",2024,07,01);
        System.out.println(b2.name);
    }
}

class BabyA
{
    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

    BabyA ()
    {
        name = "Baccha";
        aadhar_number = "202020";
        year = 2020;
        month = 9;
        day = 23;
    }

    BabyA (String name_user,String aadhar_number_user,int year_user,int month_year,int day_user)
    {
        this.name = name_user;
        this.aadhar_number = aadhar_number_user;
        this.year = year_user;
        this.month = month_year;
        this.day = day_user;
    }
}
