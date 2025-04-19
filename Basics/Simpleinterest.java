import java.util.*;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Principle : ");
        int principle=scn.nextInt();
        System.out.println("Enter the rate : ");
        int rate=scn.nextInt();
        System.out.println("Enter the time : ");
        int time=scn.nextInt();
        int simpleInterest=(principle*rate*time)/100;
        System.out.println("Here is your Simple Interest :");
        System.out.println(simpleInterest);
    }
    
}
