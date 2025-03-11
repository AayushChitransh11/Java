public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,9,7,5,21,3,0};
        int[] ans=bubbleSort(arr, 7);
        for(int item:arr){
            System.out.print(item +" ");
        }
    }

    public static int[] bubbleSort(int[] A,int n){
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(A[j]>A[j+1]){
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }
        return A;
    }
}
