public class Pattern8 {
    public static void main(String[] args) {
//     *
//    ***
//   *****
//  *******
// *********
//outer loop->5 times
//index space star space
//  0    4     1    4
//  1    3     3    3
//  2    2     5    2
//  3    1     7    1
//  4    0     9    0
//space=>n-i-1
//star=> 2i+1
        int n=5;
        for(int i=0;i<n;i++){
            //space
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            //space
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }System.out.println();
        }
    }
}
