import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num;
        num=sc.nextInt();
        int temp=num;
        int reverse=0;
        
        while(temp!=0){
            int last_digit=temp%10;
            reverse=reverse*10 + last_digit;
            temp=temp/10;
        }
        
        if(num==reverse){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        
    }
}
