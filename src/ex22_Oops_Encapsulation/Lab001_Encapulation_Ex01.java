package ex22_Oops_Encapsulation;

public class Lab001_Encapulation_Ex01 {

    public static void main(String[] args) {

        Login L = new Login("admin", "admin@123");
        System.out.println(L.getPassword());
        L.setPassword("admin123@123",false);
        String pass = L.getPassword();
        System.out.println(pass);
    }
}


class Login {

    private String UserName;
    private String Password;

    public Login(String userName, String password) {
        UserName = userName;
        Password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.Password = password;
        } else {
            System.out.println("Can't change the password!");
        }
    }
}
