import java.util.*;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float maths, physics, chem, total, combined;
        System.out.println("Enter mathematics score = ");
        maths=sc.nextFloat();

        System.out.println("Enter physics score = ");
        physics=sc.nextFloat();

        System.out.println("Enter chemistry score = ");
        chem=sc.nextFloat();

        total=maths+physics+chem;
        combined=maths+physics;
        System.out.println("Total score = "+total);
        System.out.println("Total combined score of maths and physics = "+combined);
        if(total<=190 || combined <=140){
            
            System.out.println("Not eligible for admission");
        }else{
            System.out.println("Eligible for admission");
        }
    }
}
