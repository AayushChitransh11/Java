import java.util.*;
public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number ->");
        int num;
        num=sc.nextInt();

        switch (num%2) {
            case 0:
                System.out.println(num+ " is divisible by 2");
                break;
        
            default:
            System.out.println(num+" is not divisible by 2");
                break;
        }
    }
}
