public class Avg {
     
    public static void main(String[] var0) {
       float avg = average(5.0F, 10.0F, 6.0F);
       System.out.println(avg);
    }
 
    static float average(float a, float b, float c) {
       return (a + b + c) / 3;
    }
 }