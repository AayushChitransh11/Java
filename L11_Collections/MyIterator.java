import java.util.*;
public class MyIterator {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(19);


        Iterator <Integer> iterator=al.iterator();
        while(iterator.hasNext()){
            Integer num=iterator.next();
            System.out.println(num);
            
        }
    }
}
