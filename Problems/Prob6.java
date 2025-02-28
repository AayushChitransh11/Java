import java.util.*;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,D,x1,x2;
        System.out.println("Enter value of a= ");
        a=sc.nextDouble();
        System.out.println("Enter value of b= ");
        b=sc.nextDouble();
        System.out.println("Enter value of c= ");
        c=sc.nextDouble();
        
        D=(b*b)-(4*a*c);
        

        if(D>0){
            x1=(-b + Math.sqrt(D))/(2*a);
            x2=(-b - Math.sqrt(D))/(2*a);
            System.out.println("Two Distinct real roots");
        }else if(D==0){
            double x= -b /(2*a);
            System.out.println("One Real and equal root");
            System.out.println("x = "+x);
        }else{
            double realPart=-b/(2*a);
            double ImaginaryPart=Math.sqrt(-D)/(2*a);
            System.out.println("Complex(Imaginary) roots");
            System.out.println("x1 = " + realPart + " + " + ImaginaryPart + "i");
            System.out.println("x2 = " + realPart + " - " + ImaginaryPart + "i");
        }
    }
}
