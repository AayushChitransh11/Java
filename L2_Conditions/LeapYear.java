import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Year ->");
        int year;
        year=sc.nextInt();
        if(year%400==0){
            System.out.println("Leap Year");
        }else if(year%100==0){
            System.out.println("Not a leap year");
        }else if(year % 4==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
