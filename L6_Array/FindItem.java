
public class FindItem {
    public static void main(String[] args) {
        int[] arr={45,88,56,33,5};
        int find=41;
        boolean res=false;
        for(int item:arr){
            res= (item==find)?true:false;
            
        }System.out.println(res);
    }
}
