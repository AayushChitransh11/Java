import java.util.*;;

public class MyVector {
    public static void main(String[] args){
        Vector<Integer> vec=new Vector<>();

        vec.add(14);
        vec.add(3);
        vec.add(88);
        System.out.println(vec);
        vec.remove(1);
        vec.add(44);
        vec.add(323);
        vec.add(8812);
        System.out.println(vec);
        vec.remove(1);
        System.out.println(vec);
        System.out.println(vec.capacity());

    }

}
