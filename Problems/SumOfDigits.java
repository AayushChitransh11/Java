public class SumOfDigits {
    public static void main(String[] args) {
        int n=123;
        System.out.println(sumOfDigits(n));
    }
    static int sumOfDigits(int n){
        int sum=0;
        int temp=n;
        while(temp!=0){
            
            int ld=temp%10;
            sum+=ld;
            temp=temp/10;
        }return sum;
    }
}
