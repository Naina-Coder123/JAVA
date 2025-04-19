import java.util.*;

public class TocheckusingBitwise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scn.nextInt();
        if ((num & 1) == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }
}
