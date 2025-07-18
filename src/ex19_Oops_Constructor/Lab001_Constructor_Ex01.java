package ex19_Oops_Constructor;

public class Lab001_Constructor_Ex01 {

    public static void main(String[] args) {

        Baby b = new Baby();

    }
}

class Baby
{
    // Attribute | Instance Variable |  Member variables, data members
    String name;

    // Default Constructor!
    // Fetch data from the MySQL database...
    // Read from CSV File , XLSX
    // Open a file and read the data. (json, testdata.xlsx, txt file)
    Baby()
    {
        System.out.println("Hi, I am DC");
    }

    // Behaviour
    void cry(){
        System.out.println("Cry!!");
    }

    void sleep(){
        System.out.println("Sleep!!");
    }

    void eat(){
        System.out.println("Eat!!");
    }

}
