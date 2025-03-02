public class Pattern13 {
    public static void main(String[] args) {
        int c=1;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+"    ");
                c=c+1;
            }System.out.println();
        }  
    }
    
}
