import java.util.*;

public class StringConcat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string = ");
        String s1=sc.nextLine();
        System.out.println("Enter another string");
        String s2=sc.nextLine();

        String target=s1+" "+s2;
        System.out.println(target);
        sc.close();
    }
}
