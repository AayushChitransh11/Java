package L6_Array_1D;
public class Syntax {
    public static void main(String[] args) {
        //declaration
        //<data_type>[] <array_name>;
        //instantiation of array
        //<data+type> <array_name>[]=new <data_type> [<size>]

        int[] marks;
        marks=new int[5];
        marks[0]=6;
        // System.out.println(marks[0]);
        // System.out.println(marks.length);
        //accessing the elements of the array-2 ways
        //1. for loop
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        //2. for each loop
        //for(<data_type> <variable> : <array_name>)
        for(int mark:marks){
            System.out.println(mark);
        }

        String[] names={"Aayush","Aayush11","Aayush111"};
        for(String name:names){
            System.out.println(name);
        }

    }
}
