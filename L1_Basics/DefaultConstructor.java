class Test{
    public Test(){
        System.out.println("Default constructor");
    }
    public void printTest(){
        System.out.println("Hello from printTest function");
    }
    
}

class BankAccount{
    double balance;
    public BankAccount(){
         balance=100.0;

    }
    public void printBalance(){
        System.out.println(balance);
    }
}
public class DefaultConstructor {
        public static void main(String[] args) {
        Test test=new Test();
        test.printTest();

        BankAccount ba1= new BankAccount();
        ba1.printBalance();

        }
}
