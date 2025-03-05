/**
 * This is my first JavaDoc which prints 'hello world'
 * 
 * @author Aayush Chitransh
 */

 public class JavaDoc{
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String str=printName("Aayush");
        System.out.println(str);
        

        
    }

        /**
         * This is method for printing my name
         * @param string
         * @return
         */
    public static String printName(String name){
        return name;
     }
 }