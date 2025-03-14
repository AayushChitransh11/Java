import java.nio.channels.AcceptPendingException;

class BankAccount{
    double balance;
    String accountType;
    String name;
    public BankAccount(){
        balance=22.9;
        accountType="Beggar";
        System.out.println("Default constructor");
    }
    public BankAccount(double _balance){
        balance=_balance;
        accountType="Savings";
    }
    public BankAccount(double _balance,String _accountType){
        balance=_balance;
        accountType=_accountType;
    }
    public BankAccount(double balance, String accountType, String name){
        this.balance=balance;
        this.accountType=accountType;
        this.name=name;
    }
    public void printDeatils(){
        System.out.println(accountType+" and "+ balance + " and " + name);
        
    }
    
    
}
public class ParameterisedConstructor2 {
    public static void main(String[] args) {
        BankAccount person1=new BankAccount();
        person1.printDeatils();

        BankAccount person2=new BankAccount(123.5);
        person2.printDeatils();

        BankAccount person3=new BankAccount(500.43,"Checking");
        person3.printDeatils();
        BankAccount person4=new BankAccount(900000.8,"Savings","Aayush");
        person4.printDeatils();
    }
}
