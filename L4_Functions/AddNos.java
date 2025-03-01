import java.util.*;
public class AddNos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number ->");
        num1=sc.nextInt();
        System.out.println("Enter second number ->");
        num2=sc.nextInt();
        int sum=add(num1,num2);
        System.out.println("Sum = "+sum);
    }
    static int add(int a,int b){
        return a+b;
    }
}
