package L6_Array_1D;
public class PrintCube  {   
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[]cube=new int[arr.length];
        int i=0;
        for(int item:arr){
            cube[i]=(item*item*item);
            i++;
        }
        for(int item:cube){
            System.out.println(item);
        }


    }
    
}
