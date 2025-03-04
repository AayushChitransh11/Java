import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter a number =>");
                arr[i][j]=sc.nextInt();
            }
        }
        //displaying elements of array
        for(int[]row:arr){
            for(int element:row){
                System.out.print(element+" ");
            }System.out.println();
        }
    }
}
