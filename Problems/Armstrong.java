

public class Armstrong {
    public static void main(String[] args) {
        int n=370;
        System.out.println(armstrong(n));
    }
    static boolean armstrong(int num){
        int temp=num;
        int sum=0;
        while(temp!=0){
            int ld=temp%10;
            sum+=ld*ld*ld;
            temp/=10;
        }
        return sum==num;
    }
}
