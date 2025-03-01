public class SumEven {
    public static void main(String[] args) {
        int sum=evensum(10);
        System.out.println(sum);
        }

    // static int evensum(int num){
    //     int sum=0;
    //     for(int i=1;i<=num;i++){
    //         if(i%2==0){
    //             sum+=i;
    //         }
    //     }return sum;
    // }

    // ORDER of n
    static int evensum(int num){
        // int sum=(num * (num+1))/2;
        // //example-> 5(odd number)
        // total -> 5*6/2->15
        // odd -> 15/2->7.5
        // even -> 15/2->7.5
        // even numbers->2,4=6
        // odd numbers->1,3,5=9

        // //example 2 -> 6(even number)
        // total ->6*7/2=21
        // odd=even=21/2=10.5
        // odd numbers->1,3,5=9
        // even numbers->2,4,6=12

        return num/2 * ((num/2)+1);
    }
}
 