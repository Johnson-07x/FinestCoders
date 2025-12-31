package ExceptionHandling;

import java.util.Scanner;

class checkLoginCredentials extends Exception {
    checkLoginCredentials(String msg) {
        super(msg);
    }
}

public class CheckUserData {
    static void check(String uName, String pass) throws checkLoginCredentials{
        String actualUname = "Johnson";
        String actualPass = "1234";
        if (uName.equals(actualUname) && pass.equals(actualPass)) {
            System.out.println("Login Successful");
        }else {
            throw new checkLoginCredentials("Invalid Credentials");
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String userName = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        try {
            check(userName, password);
        }catch (checkLoginCredentials e){
            System.out.println(e);
        }
    }
}
