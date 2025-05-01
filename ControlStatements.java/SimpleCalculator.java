import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int first = input.nextInt();
        System.out.println("Enter the second number:");
        int second = input.nextInt();
        System.out.println("Enter the symbol:");
        char ch = input.next().charAt(0);
        int result;
        switch (ch) {
            case '*':
                result = first * second;
                System.out.println(result);
                break;
            case '+':
                result = first + second;
                System.out.println(result);
                break;
            case '-':
                result = first - second;
                System.out.println(result);
                break;
            case '/':
                result = first / second;
                System.out.println(result);
                break;

        }

    }
}
