

public class PrintPrimes {
    public static void main(String[] args) {
        int[] arr={4,5,6,2,3,8,4,13};
        for(int item:arr){
            if(checkPrime(item)){
                System.out.println(item+ " ");
            }
        }
        
    }
    static boolean checkPrime(int num){
        if(num==2) return true;
        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
