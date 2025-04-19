import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        printFibo(5);
    }

    public static void printFibo(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ," + b);
        for (int i = 2; i < num; i++) {
            int c = a + b;
            System.out.print("," + c);
            a = b;
            b = c;

        }

    }
}
