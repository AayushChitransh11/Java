import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String grade;
        System.out.print("Enter grade -> ");
        grade=sc.nextLine();

        switch(grade){
            case "A":
                System.out.println("A");
                break;
            case "B+":
                System.out.println("B+");
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("F");
        }
    }
}
