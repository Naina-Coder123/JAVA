import java.util.*;

public class Agegroups {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = scn.nextInt();
        if (age <= 60) {
            System.out.println("Adult");
        } else if (age <= 20) {
            System.out.println("Teen");
        } else if (age <= 13) {
            System.out.println("Child");
        } else {
            System.out.println("Senior");
        }

    }
}
