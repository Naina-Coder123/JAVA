import java.util.*;

public class Calculategrade {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the percentage");
        int percentage = scn.nextInt();
        if (percentage > 90) {
            System.out.println('A');

        } else if (percentage > 75) {
            System.out.println('B');
        } else if (percentage > 60) {
            System.out.println('C');
        } else if (percentage > 30) {
            System.out.println('D');
        } else {
            System.out.println('E');
        }

    }
}
