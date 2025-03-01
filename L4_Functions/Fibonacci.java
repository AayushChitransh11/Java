
public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(5);
    }
    static void fibonacci(int num){
        if(num>=1){
            System.out.print(0+" ");
        }
        if(num>=2){
            System.out.print(1+" ");
        }
        int num1=0;
        int num2=1;
        int num3=num1+num2;
        
        int count=2;
        while(count<num){
            num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;
            count++;

        }
        
    }  
}
