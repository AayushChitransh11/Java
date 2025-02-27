public class Prob1 {
    public static void main(String[] args) {
        solve(18);
    }

    static int[] solve(int n){
        int size=(int) n/5;
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
             System.out.println((i+1)*5);
        }
        return arr;
    }
}

