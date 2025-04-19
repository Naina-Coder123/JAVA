import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int factorial = fact(5);
        System.out.println(factorial);
    }

    public static int fact(int num) {
        int i = 1;
        int m = 1;
        while (i <= num) {
            m *= i;
            i++;
        }
        return m;
    }
}
