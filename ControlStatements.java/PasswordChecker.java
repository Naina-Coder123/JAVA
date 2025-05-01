import java.util.*;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String password;
        do {
            System.out.println("Enter the password :");
            password = scn.nextLine();
        } while (!isValidPassword(password));
        System.out.println("Thanks for telling password");
    }

    public static boolean isValidPassword(String pass) {
        return pass.length() > 6;

    }
}
