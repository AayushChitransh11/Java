class BankAccount{
    private double balance;
    
    public BankAccount(){
        this.balance=balance;

    }
    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }
}


public class Encapsulation {
    public static void main(String[] args) {

        BankAccount test=new BankAccount();

        test.setBalance(100);
        System.out.println(test.getBalance());

    
    }
}
