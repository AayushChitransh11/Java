

public class LC258 {
    public static void main(String[] args) {
        int n=383;
        System.out.println(addDigits(n));
    }
    static int addDigits(int num){
        while (num>=10) {
            int sum=0;
            while(num!=0){
                int ld=num%10;
                sum+=ld;
                num/=10;
            } 
            num=sum;
        }return num;
        
    }
    
}
