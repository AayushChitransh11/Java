
public class Syntax {
    public static void main(String[] args) {
        int rows=2;
        int cols=3;
        //matrix-we define the both col and rows before
        int [][] arr=new int[rows][cols];
        //square matrix-2*2(rows=cols)
        int [][] arr2=new int[2][2];
        //2D array-defining number of rows is important in 2D array
        int[][] arr3=new int[4][];
        int[][] arr4={{1,2},{3,4,5,6},{},{33}};
        //making row empty will give compile time error
    }
   
        
}
