import java.util.*;
public class Smalles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1,num2,num3,num4;
        System.out.println("Enter first number = ");
        num1=sc.nextInt();
        System.out.println("Enter second number = ");
        num2=sc.nextInt();
        System.out.println("Enter third number = ");
        num3=sc.nextInt();
        System.out.println("Enter fourth number = ");
        num4=sc.nextInt();

        int smallest;
        if(num1<num2 && num1<num3 && num1<num4){
            smallest=num1;
        }
        else if(num2<num3 && num2<num4){
            smallest=num2;
        }
        else if(num3<num4){
            smallest=num3;
        }else{
            smallest=num4;
        }

        System.out.println("Smallest = "+smallest);
    }
}
