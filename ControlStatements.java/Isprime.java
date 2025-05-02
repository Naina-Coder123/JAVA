import java.util.*;

public class Isprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(isPrime(number));
    }

    public static boolean isPrime(int num) {

        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        } else
            return false;
    }
}
