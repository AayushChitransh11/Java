
public class DecimalToBinary {
    public static void main(String[] args) {
        int n=13;
        String s="";
        while(n>0){
            int rem=n%2;
            s=rem+s;
            n=n/2;
        }
        int bit=Integer.parseInt(s);
        System.out.println(bit);
    }
}
