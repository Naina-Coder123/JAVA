import java.util.*;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = scn.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }

    }
}
