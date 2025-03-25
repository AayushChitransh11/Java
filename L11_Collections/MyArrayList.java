import java.util.*;
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> aList=new ArrayList<>();
        ArrayList<Integer> bList=new ArrayList<>();
        aList.add(13);
        System.out.println(aList);
        aList.add(40);
        aList.add(32);
        System.out.println(aList);

        aList.add(1,100);
        System.out.println(aList);
        aList.remove(3);
        System.out.println(aList.get(2));
        System.out.println(aList);
        System.out.println(aList.reversed());
       

        
    }
}
