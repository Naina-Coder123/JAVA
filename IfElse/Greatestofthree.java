import java.util.*;

public class Greatestofthree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int x = scn.nextInt();
        System.out.println("Enter the second number : ");
        int y = scn.nextInt();
        System.out.println("Enter the third number : ");
        int z = scn.nextInt();
        if (x > y && x > z) {
            System.out.println("x is greatest");
        } else if (y > x && y > z) {
            System.out.println("y is greatest");
        } else {
            System.out.println("z is greatest");
        }
    }
}
