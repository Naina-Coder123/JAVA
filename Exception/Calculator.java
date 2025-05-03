import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("WELCOME TO DIVISION CALCULATOR :");
        System.out.println("Please enter your two numbers : ");
        int first = scn.nextInt();
        int second = scn.nextInt();
        // try {
        // int result = first / second;
        // System.out.println(result);
        // } catch (ArithmeticException excepted) {
        // System.out.println("Divide by zero ,Invalid");
        // }
        // WELCOME TO DIVISION CALCULATOR :
        // Please enter your two numbers :
        // 9
        // 0
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at Calculator.main(Calculator.java:10)
        // PS C:\Users\naina\JAVA\JAVA\Exception>
        try {
            int[] a = new int[5];
            // System.out.println(a[6]);
            a[6] = first / second;
            System.out.println(a[6]);

        } catch (ArithmeticException e) {
            System.out.println("Invalid values,give valid values");

        } catch (NumberFormatException | InputMismatchException i) {
            System.out.println("invalid number format");

        } catch (Throwable th) {
            System.out.println("General Exception");
        }

    }
}