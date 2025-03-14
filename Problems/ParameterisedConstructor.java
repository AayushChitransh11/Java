class BankAccount{
    double balance;
    public BankAccount(){
        balance=100.0;
    }
    
    public BankAccount(double _balance){
        balance=_balance;
    }
    public void printBalance(){
        System.out.println(balance);
    }      
}
public class ParameterisedConstructor {
    public static void main(String[] args) {
        BankAccount test=new BankAccount();
        test.printBalance();
        BankAccount test2=new BankAccount(403.2);
        test2.printBalance();
    }
}
