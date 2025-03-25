
import java.util.ArrayDeque;

public class MyArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(10);
        ad.offer(14);
        ad.offer(54);
        ad.offer(89);
        for(var num:ad){
            System.out.print(num + " ");
        }System.out.println();

        ad.poll();
        System.out.println(ad);
        System.out.println(ad.peek());
    }
}
