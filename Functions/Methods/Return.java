import java.util.*;

public class Return {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        System.out.println("Enter the first number : ");
        int first = scn.nextInt();
        System.out.println("Enter the second number : ");
        int second = scn.nextInt();
        int p = sum(first, second);
        System.out.println(p);

    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
