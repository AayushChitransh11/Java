public class WeekDaysWhile {
    public static void main(String[] args) {
        int i=1;
        while(i<=4){
            System.out.println("Week-> "+i);
            int j=1;
            while(j<=7){
                System.out.print("Day: "+j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
