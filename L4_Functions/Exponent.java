public class Exponent {
    public static void main(String[] args) {
        int exponent=exponent(2, 3);
        System.out.println(exponent);
    }

    static int exponent(int x,int n){
        int exponent=1;
        int count=1;
        while(count<=n){
            exponent*=x;
            count++;
        }return exponent;
    }
}
