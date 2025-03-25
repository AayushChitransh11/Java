
import java.util.*;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap <Integer,String> tm=new TreeMap<>();
        tm.put(2,"Raj");
        tm.put(4,"Reena");
        tm.put(1,"Aayush");
        System.out.println(tm);
        tm.put(0,null);
        System.out.println(tm);
        System.out.println(tm.ceilingKey(3));
        System.out.println(tm.floorKey(3));
        Set <Integer> st=tm.keySet();
        System.out.println(st);

    }
}
