
public class Methods {
    public static void main(String[] args) {
        String s="Aayush";
        int len=s.length();
        String sub=s.substring(0, 2);
        String sub2=s.substring(1);
        System.out.println(sub);
        System.out.println(sub2);
        System.out.println(len);
        String str="Aayush-Chiransh";
        String[] arr=str.split("-");
        for(String item:arr){
            System.out.println(item);
        }

        String st="car";
        st=st+"mercedes";
        System.out.println(st);

        
    }
}
