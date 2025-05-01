import java.util.*;

class Counttheoccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the element: " + (i + 1) + " :");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element : ");
        int element = input.nextInt();
        int c=count(element,arr,size);
        System.out.println("Count :" + c);

    }

    public static int count(int element, int[] arr, int size) {

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (element == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
