import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        fibo(n);
    }

    public static void fibo(int num) {
        if (num < 1) {
            return;

        }
        int a = 0;
        int b = 1;
        System.out.println(a + " ");
        if (num == 1) {
            return;
        }
        for (int i = 2; i < num; i++) {
            int current = a + b;
            a = b;
            b = current;
            System.out.println(current + " ");
        }
    }
}