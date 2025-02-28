import java.util.*;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number = ");
        int num;
        num=sc.nextInt();
        if(num>0){
            System.out.println("1");
        }else if(num==0){
            System.out.println("0");
        }else{
            System.out.println("-1");
        }
    }
}
