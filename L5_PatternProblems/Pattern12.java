public class Pattern12 {
    public static void main(String[] args) {
        // 1
        // 01
        // 101
        // 0101
        // 10101
        int n=5;
        int start;
        for(int i=1;i<=n;i++){
            start= (i%2==1) ? 1 : 0;
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }System.out.println();

        }
    }
}
