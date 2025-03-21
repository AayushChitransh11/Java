import java.util.Scanner;
public class UserInputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Enter lastName");
        String lastName=sc.next();
        System.out.println(num);
        System.out.println(name);
        System.out.println(lastName);
    }
}
