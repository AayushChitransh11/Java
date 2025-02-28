import java.util.*;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter height ->");
        int height;
        height=sc.nextInt();
        
        if(height<150){
            System.out.println("Dwarf");

        }else if(height>150 && height<190){
            System.out.println("Average");
        }
        else{
            System.out.println("Tall");
        }
    
    }
}
