import java.util.*;

public class Reversedigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int reversed = reverse(number);
        System.out.println(reversed);
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        return rev;
    }
}