import java.util.*;
public class Divisibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num;
        System.out.println("Enter a number = ");
        num=sc.nextInt();

        if(num%5==0 && num%8==0){
            System.out.println(num+" is divisible by both 5 and 8");
        }
        else if(num%5==0 && num%8!=0){
            System.out.println(num+" is only divisible by 5"); 
        }
        else if(num%5!=0 && num%8==0){
            System.out.println(num+ " is only divisible by 8");
        }else{
            System.out.println(num+" is neither divisible by 5 nor by 8");
        }
    }
}
