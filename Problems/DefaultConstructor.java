class Test{
    public Test(){
        System.out.println("Hello from Default constructor!");
    }
    public void myfun(){
        System.out.println("Hello from myfun");
    }
}


public class DefaultConstructor {
    public static void main(String[] args) {
        Test obj=new Test();
        obj.myfun();
        
    }
}
