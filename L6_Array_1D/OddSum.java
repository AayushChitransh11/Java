package L6_Array_1D;
public class OddSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=0;
        for(int item:arr){
            if(item%2!=0){
                sum+=item;
            }
        }
        System.out.println(sum);
    }
}
