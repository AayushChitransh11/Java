import java.util.*;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        st.add(2, 0);
        System.out.println(st);
        
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        st.push(100);
        System.out.println(st);
        System.out.println(st.size());
        
        
        System.out.println(st.empty());
        System.out.println(st.isEmpty());
        System.out.println(st.search(0));
        System.out.println(st.search(90));

        }
}
