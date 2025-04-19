import java.util.*;
class Naina{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=scn.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="NAINA";
           System.out.println(Arrays.toString(str));
           str[2]="Love";
              System.out.println(Arrays.toString(str));
    }
}
