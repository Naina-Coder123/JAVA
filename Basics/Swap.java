
import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number :");
        int myFirstnumber = input.nextInt();
        System.out.println("Enter your second number :");
        int mySecondnumber = input.nextInt();
        // int temp = myFirstnumber;
        // myFirstnumber = mySecondnumber;
        // mySecondnumber = temp;
        myFirstnumber = myFirstnumber + mySecondnumber;
        mySecondnumber = myFirstnumber - mySecondnumber;
        myFirstnumber = myFirstnumber - mySecondnumber;
        System.out.println(myFirstnumber);
        System.out.println(mySecondnumber);

    }
}
