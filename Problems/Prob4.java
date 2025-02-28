import java.util.*;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter X Coordinate = ");
        x=sc.nextInt();
        System.out.println("Enter Y Coordinate = ");
        y=sc.nextInt();

        int n;
        if(x>0 && y>0){
            n=1;
        }else if(x<0 && y>0){
            n=2;
        }else if(x<0 && y<0){
            n=3;

        }else if(x>0 && y<0){
            n=4;
        }
        else //if(x==0 && y==0){
            {
            System.out.println("Your point is at the center");
            return;
        }
        System.out.println("Your Quadrant is "+n);
    }
}
