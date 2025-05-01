import java.util.*;

public class Ternaryoperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to nnumber checker");
        System.out.println("Please enter your first number: ");
        int num1 = scn.nextInt();
        System.out.println("Please enter your second number :");
        int num2 = scn.nextInt();
        // if (num1 > num2) {
        // greater = num1;
        // // System.out.println(num1 + "is the greatest number ");
        // } else {
        // // System.out.println(num2 + "is the greatest number ");
        // greater = num2;
        // }
        int greater = num1 > num2 ? num1 : num2;

        System.out.println(greater);
    }
}
