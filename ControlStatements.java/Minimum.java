import java.util.*;

public class Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the minimum detector: ");
        System.out.println("Enter the first number :");
        int first = input.nextInt();
        System.out.println("Enter the second number :");
        int second = input.nextInt();
        int min = first < second ? first : second;
        System.out.println(min + "is the minimum number ");

    }
}
