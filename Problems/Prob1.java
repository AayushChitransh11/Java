public class Prob1 {
    public static void main(String[] args) {
        int arr[]=solve(45);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }

    static int[] solve(int n){
        int size=(int) n/5;
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            //  System.out.println((i+1)*5);
             arr[i]=(i+1)*5;
        }
        return arr;
    }
}

