import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        // add element in arraylist use add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //add at Index in arrayList use add
        list.add(1,50);
        list.add(4,40);
        System.out.println(list);

        //get use to  getting any Index item
        System.out.println(list.get(1));
        System.out.println(list.get(4));

        //set use to set element in arrayList
        list.set(1,60);
        list.set(4,50);
        System.out.println(list);

        //remove use to element remove From arraylist
        list.remove(1);
        list.remove(3);
        System.out.println(list);

        //size use to size of arraylist
        System.out.println(list.size());
    }
}
