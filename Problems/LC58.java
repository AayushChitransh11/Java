import java.util.*;

public class LC58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string = ");
        s=sc.nextLine();
        int n=s.length()-1;
        while(s.charAt(n)==' '){
            n--;
        }
        int count=0;
        while(s.charAt(n)!=' '){
            count++;
            n--;
        }
        System.out.println(count);


    }
}
