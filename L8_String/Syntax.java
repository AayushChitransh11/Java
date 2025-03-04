
public class Syntax {
    public static void main(String[] args) {
    char[] ch={'a','b','c'};
    String str1=new String(ch);//new keyword
    
    String str2="aayush"; //string literal
    String str3="Chitransh";// it creates a new instance and place inside the string pool of Java heap memory
    String str4="Chitransh";//returns the reference to the already created instance
    // str3==str4;
    String str=new String("Joel");
    String sr=new String("Joel");
        System.out.println(str3==str4);
        System.out.println(str4);
        System.out.println(str3);
        System.out.println(str==sr);
    }
    //Stings are immutable in java
   
}
