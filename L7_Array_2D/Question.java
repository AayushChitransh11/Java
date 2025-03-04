import java.lang.reflect.Array;
import java.util.*;

public class Question {
    public static void main(String[] args) {
        //WAP to get marks for 4 students for 3 subjects as input, 
        //and find total, highest, lowest and avg marks for each student.
        Scanner sc=new Scanner(System.in);
        int namesRows,namesCols;
        System.out.println("Enter rows for names = ");
        namesRows=sc.nextInt();
        System.out.println("Enter cols for names = ");
        namesCols=sc.nextInt();
        String[][] names=new String[namesRows][namesCols];
        for(int i=0;i<names.length;i++){
            for(int j=0;j<names[i].length;j++){
                System.out.println("Enter name of Student = ");
                names[i][j]=sc.nextLine();
            }
        }
        int[][] subjects=new int[4][3];
        
        for(int i=0;i<subjects.length;i++){
            for(int j=0;j<subjects[i].length;j++){
                System.out.println("Enter marks = ");
                subjects[i][j]=sc.nextInt();
            }
        }
        //total
        int [] total=new int[4];
        int[] highest=new int[4];
        int[] lowest=new int[4];
        double[] average=new double[4];

        Arrays.fill(lowest, Integer.MAX_VALUE);
        Arrays.fill(highest, Integer.MIN_VALUE);
        
        for(int i=0;i<subjects.length;i++){
            int sum=0;
            for(int j=0;j<subjects[i].length;j++){
                sum+=subjects[i][j];

                if(subjects[i][j]>highest[i]){
                    highest[i]=subjects[i][j];
                }
                if(subjects[i][j]<lowest[i]){
                    lowest[i]=subjects[i][j];
                }

            }
            total[i]=sum;
            average[i]=sum/(double) subjects[i].length;
        }

        //printing
        for(int i=0;i<names.length;i++){
            System.out.println("Student: " + names[i]);
            System.out.println("Total Marks: " + total[i]);
            System.out.println("Highest Marks: " + highest[i]);
            System.out.println("Lowest Marks: " + lowest[i]);
            System.out.println("Average Marks: " + average[i]);
            System.out.println("-----------------------------");
        }
        

        

    }
}
