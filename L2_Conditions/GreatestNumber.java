import java.util.*;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1,num2,num3;
        System.out.println("Enter first number = ");
        
        
        num1=sc.nextInt();
        System.out.println("Enter second number = ");
        num2=sc.nextInt();
        
        System.out.println("Enter third number = ");
        num3=sc.nextInt();
        if(num3>num1){
            if(num3>num2){
                System.out.println("Greatest = "+num3);
            }else{
                System.out.println("Greatest = "+num2);
            }
        }else {
            if(num2>num1){
                System.out.println("Greatest = "+num2);
            }else{

                System.out.println("Greatest = "+num1);
            }
        }
    }
}