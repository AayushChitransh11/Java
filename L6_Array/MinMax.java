public class MinMax {
    public static void main(String[] args) {
        int[] markList={98,97,5};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<markList.length;i++){
            if(min>markList[i]){
                min=markList[i];
            }
            if(max<markList[i]){
                max=markList[i];
            }
            sum+=markList[i];
        }System.out.println("Min="+min+" Max="+max);
        System.out.println("Sum="+sum);
        System.out.println("Avg="+(float)sum/markList.length);
        
    }
}
