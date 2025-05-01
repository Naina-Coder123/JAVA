import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter the number : ");
            number = input.nextInt();

        } while (!isNumberGuess(number));
        System.out.println("yeah!you guessed the correct number .");

    }

    public static boolean isNumberGuess(int num) {
        return num == 2;
    }
}
