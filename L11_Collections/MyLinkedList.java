import java.util.*;
public class MyLinkedList {
    public static void main(String[] args) {
    LinkedList<Integer> li=new LinkedList<>();
    li.add(9);
    li.add(5);
    li.addFirst(1);
    li.addFirst(2);
    System.out.println(li); // 2,1,9,5
    li.remove();
    System.out.println(li); //1,9,5
    li.removeFirst();   //9,5-> removeFirst and remove workd in the same way
    System.out.println(li); 
    li.add(19);
    li.add(1,2);
    System.out.println(li); 
    System.out.println(li.contains(19));
    System.out.println(li.contains(3));
    System.out.println(li.size());
    }

}
