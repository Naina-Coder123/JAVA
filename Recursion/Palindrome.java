import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int orig = palindrome(0, number);
        System.out.println(orig);
        if (orig == number) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static int palindrome(int orig, int num) {
        if (num == 0) {
            return orig;
        }
        orig = orig * 10 + (num % 10);
        return palindrome(orig, num / 10);
    }
}
