
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // System.out.println(list.size());
        list.add(1);// 0
        list.add(5);// 1
        list.add(10);// 2

        System.out.println(list.get(2));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int x : list) {
            System.out.println(x);
        }
        System.out.println(list.contains(2));
        System.out.println(list.contains(10));
        System.out.println(list.remove(1));
        list.add(1, 7);// index 1 value 5 will be shifted to next
        for (int x : list) {
            System.out.println(x);
        }
        list.set(0, 90);// but in this list.set it will replace the value at that
        // index
        for (int x : list) {
            System.out.println(x);
        }
        System.out.println(list);

    }
}
