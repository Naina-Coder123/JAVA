import java.util.*;
public class MaxandMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size :");
        int size=input.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element :"+(i+1)+" :");
            nums[i]=input.nextInt();
        }
        int max_element=max(nums, size);
        System.out.println("Maximum Element :"+max_element);
        int min_element=min(nums, size);
        System.out.println("Minimum Element :"+min_element);

    }
    public static int max(int[] arr,int size){
        int m=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    public static int min(int[] arr,int size){
        int m=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]<m){
                m=arr[i];
            }
        }
        return m;
    }
}
