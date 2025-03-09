
public class BinaryToDecimal {
    public static void main(String[] args) {
        int ans=0;
        int i=0;
        int n=1101;
        while(n>0){
            int rem=n%10;
            ans+=rem*Math.pow(2, i);
            i++;
            n=n/10;
        }
        System.out.println(ans);
    }
} 
