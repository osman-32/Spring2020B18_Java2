package day33_CustomClass;

public class BankAccount {
    /*
    practice task:
    create a custom class for bank account
      attrubutes: accountholder, accountnumber, balance
      actions: cehckingBalance(), withDraw( amount ), deposit( amount )
     */
    String accountHolder;
    long acconuntNumber;
    double balance;

    public void checkingBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public void withDraw(double amount){
        System.out.println("Withdrawing $"+amount);
        balance-=amount;
    }

    public void deposit(double amount){
        System.out.println("Depositiong $"+amount);
        balance+=amount;
    }

    public String toString(){
        String result="Account Holder: "+accountHolder+"\nAccountNumber: "+acconuntNumber+"\nAvailable balance $"+balance;
        return result;
    }
}
