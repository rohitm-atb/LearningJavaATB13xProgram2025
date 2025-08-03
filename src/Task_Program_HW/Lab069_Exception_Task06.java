package Task_Program_HW;

/*Task 6: Catch Specific vs Generic Exception
📘 Description:
Try the same code twice — once using catch(Exception e) and once using catch(NullPointerException e).
Compare output and behavior.*/

public class Lab069_Exception_Task06 {
    public static void main(String[] args) {
        // Using generic catch
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Generic catch: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        // Using specific catch
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Specific catch: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

}
