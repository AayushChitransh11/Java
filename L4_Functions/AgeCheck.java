
public class AgeCheck {
    public static void main(String[] args) {
        boolean check=checkAge(18);
        System.out.println(check);
    }
    static boolean checkAge(int age){
        if(age>=18 && age<=60){
            return true;
        }
        else{
            return false;
        }
    }
}
