public class Pattern9 {
    public static void main(String[] args) {
    //*********
    // *******
    //  *****
    //   ***
    //    * 
    //index space star space
    //  0     0     9   0
    //  1     1     7   1
    //  2     2     5   2
    //  3     3     3   3   
    //  4     4     1   4 
    // space=>i
    //star=>2*n-2*i-1
    int n=5;
    for(int i=0;i<n;i++){
        //space
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }

        //star
        for(int j=0;j<(2*n)-(2*i)-1;j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }System.out.println();
    }
    }
}
