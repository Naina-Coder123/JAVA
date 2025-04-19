import java.util.*;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the principle :");
        int principle=scn.nextInt();
        System.out.println("Enter the rate :");
        int rate=scn.nextInt();
        System.out.println("Enter the time :");
        int time=scn.nextInt();
        int compoundInterest=principle*(1+(rate/100))*time;
        System.out.println(compoundInterest);
    }
}
