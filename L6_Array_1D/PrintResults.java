package L6_Array_1D;

public class PrintResults {
    public static void main(String[] args) {
        //WAP which takes roll no and marks in 3 subjects for 3 students. 
        //Print the roll no, marks, and average for all students.
        int[] roll={1,2,3};
        int[] marks1={45,78,66};
        int[] marks2={99,99,99};
        int[] marks3={5,66,55};
        float avg=0;
        int sum=0;
        
        for(int item:marks1){
            sum+=item;
            avg=sum/marks1.length;
        }
        System.out.println("Roll no="+roll[0]+"Average="+avg);
    }    
}
