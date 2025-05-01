import java.util.*;
public class Isarraysorted {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=scn.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(sortedArray(arr, size));
    }
    public static boolean sortedArray(int[] arr,int size){
       boolean flag=true;
        for(int i=1;i<size;i++){
            if(!(arr[i]>arr[i-1] )){
                flag=false;

            }
        }
        return flag;

    }
}
