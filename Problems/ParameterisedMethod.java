class Test{
    public int sum(int n1,int n2){
        return n1+n2;
    }
}


public class ParameterisedMethod {

    
    public static void main(String[] args) {
        Test obj=new Test();

        System.out.println(obj.sum(10,12));

    }
}
