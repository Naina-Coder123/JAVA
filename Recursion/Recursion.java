import java.util.*;
public class Recursion {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number : ");
        int num=input.nextInt();
        long fact=factorial(num);
        System.out.println("Farctorial of your number : "+ fact);
     }
     public static long factorial(int num){
        if(num==1){
            return 1;
        }
        else
        return num*factorial(num-1);
     }

}
