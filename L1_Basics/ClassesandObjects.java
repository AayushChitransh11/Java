class Test{
    int age;
    public void assign(int num){
        age=num;
    }
}

class MyClass{
    public int sum(int num1,int num2){
        return num1+num2;
    }
}

public class ClassesandObjects {
    public static void main(String[] args) {
        System.out.println("In main method");

        Test test1=new Test();
        test1.assign(10);

        Test test2=new Test();
        test2.assign(60);
        System.out.println(test1.age);
        System.out.println(test2.age);

        MyClass obj1=new MyClass();
        System.out.println(obj1.sum(10,15));
    }
}
