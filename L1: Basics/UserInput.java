import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numnber = ");
        int a =sc.nextInt();
        System.out.println(a);


        System.out.println("Enter a float number = ");
        float b= sc.nextFloat();
        System.out.println(b);

        System.out.println("Enter a boolean = ");
        boolean c=sc.nextBoolean();
        System.out.println(c);

        sc.nextLine();
        
        System.out.println("Enter a string = ");
        String s=sc.nextLine();
        System.out.println(s);
        sc.close();
    }
}   
