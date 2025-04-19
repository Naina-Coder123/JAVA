import java.util.*;

public class Pattern {
    public static void main(String[] args) {

        System.out.println("Printing the first");
        printFirst();
        System.out.println("Printing the second");
        printSecond();
        System.out.println("Method calling is complete");
    }

    public static void printFirst() {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * * ");
        System.out.println("* * * *");
        System.out.println("* * * * *");

    }

    public static void printSecond() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * * ");
        System.out.println("* *");
        System.out.println("*");

    }
}
