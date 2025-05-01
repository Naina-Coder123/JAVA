import java.util.*;
public class SumandAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int size=input.nextInt();
        int[] nums=new int[size]; 
        for(int i=0;i<size;i++){
            System.out.println("Please enter element no: "+(i+1) +" :");
            nums[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=nums[i];

        }
        System.out.println("Sum: "+ sum);
        int average=sum/size;
        System.out.println("Average: "+average);

        


    

    }
    

}
