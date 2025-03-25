
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(4);
        ts.add(3);
        ts.add(44);
        ts.add(12);
        ts.add(121);
        ts.add(543);
        ts.add(42);
        System.out.println(ts);
        ts.remove(4);
        System.out.println(ts);
        System.out.println(ts.ceiling(10));
        System.out.println(ts.floor(10));
        System.out.println(ts.ceiling(10));
        System.out.println(ts.floor(120));
        System.out.println(ts.ceiling(122));
        
    }
}
