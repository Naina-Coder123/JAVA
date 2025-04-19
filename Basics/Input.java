import java.util.*;
public class Input{
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        // System.out.println("Enter your name :");
        // String name=inp.nextLine();
        // System.out.println(name);
        // int age=inp.nextInt();
        // System.out.println(age);
        // float amount=inp.nextFloat();
        // System.out.println(amount);

        System.out.print("Please enter your name :");
        String name=scn.nextLine();
        System.out.println("Good Morning" +" " + name + " "+"Have a nice day!");
        System.out.println(name + ", Also tell me your age ");
        int age=scn.nextInt();
        System.out.println("Your age is: " + age);
        //Post Increment and Pre Increment
        int p=5;
        System.out.println(p++);
        System.out.println(p);
        System.out.println(++p);
        System.out.println(p);
       





    }
}