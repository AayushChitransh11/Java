class BankAccount{
    double balance;
    String accountType="Savings";
    public BankAccount(double balance){
        this.balance=balance;
    }
    public BankAccount(double balance,String accountType){
        this.balance=balance;
        this.accountType=accountType;


    }
    public void printDetails(){
        System.out.println(balance);
        System.out.println(accountType);
    }
}

public class ParameterisedConstructor {
    public static void main(String[] args) {
        
        BankAccount obj1=new BankAccount(100);
        obj1.printDetails();

        BankAccount obj2=new BankAccount(50,"Checking");
        obj2.printDetails();
    }
}
