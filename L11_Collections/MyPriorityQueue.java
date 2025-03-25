
import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(4);
        pq.offer(23);
        pq.offer(-4);
        pq.offer(-5);
        // System.out.println(pq);
        // System.out.println(pq.peek());

        //print all the elements of pq?
        while(pq.isEmpty()==false){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
