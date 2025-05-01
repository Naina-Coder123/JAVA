import java.util.*;

public class Myfirstarray {
    public static void main(String[] args) {
        // int[] arr={2,3,4,5,6};
        int[] myarray = new int[5];
        myarray[0] = 1;
        myarray[1] = 2;
        myarray[2] = 3;
        myarray[3] = 4;
        myarray[4] = 5;
        // System.out.println(myarray[0]);
        // System.out.println(myarray[1]);
        // System.out.println(myarray[2]);
        // System.out.println(myarray[3]);
        // System.out.println(myarray[4]);
        for (int i = 0; i < myarray.length; i++) {
            System.out.println(myarray[i]);
            i = i + 1;
        }
        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        int[][] myarr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(myarr[0].length);
        int i = 0;
        while (i < myarr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(myarr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}