import java.util.*;

public class Numberisprime {
    public static void main(String[] args) {
        System.out.println(isPrime(10));
    }

    public static boolean isPrime(int num) {
        int i = 2;
        int count = 0;
        while (i * i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 0) {
            return true;
        } else
            return false;

    }
}
