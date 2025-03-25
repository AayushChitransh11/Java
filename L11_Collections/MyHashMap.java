

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap <Integer,String> hm=new HashMap<>();
        hm.put(2,"Raj");
        hm.put(4,"Reena");
        hm.put(1,"Aayush");
        System.out.println(hm);
        hm.put(0,null);
        System.out.println(hm);


    }
}
