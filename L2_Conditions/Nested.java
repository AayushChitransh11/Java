// package L2_Conditions;

public class Nested {
    public static void main(String[] args) {
        int num=10;
        if(num>5){
            if(num>7){
                System.out.println(num+ " is greater than 7");
            }else{
                System.out.println(num+ " is greater than 5");
            }
        }else{
            System.out.println(num+ " is less than 5");
        }
    }
}
