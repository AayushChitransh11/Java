import java.util.*;
public class AddTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number = ");
        int num1=sc.nextInt();
        System.out.println("Enter another number");
        int num2=sc.nextInt();

        int sum=num1+num2;
        System.out.println("Sum = "+ sum);
        sc.close();
    }
}
