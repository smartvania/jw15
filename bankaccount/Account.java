package bankaccount;

/**
 * Created by Yanilda on 10/14/2015.
 */
public class Account
{
    private double balance=0.0;
    private int accountNumber=0;
    public Account(int number,double initialBalance)
    {
        accountNumber=number;
        if(initialBalance>0.0)
            balance=initialBalance;
    }
    public int getNumberAccount()
    {
        return accountNumber;
    }
    public void credit(double amount)
    {
        balance=balance+amount;
    }

    public void debit(double amount)
    {
        balance=balance-amount;
    }

    public double getBalance()
    {
        return balance;
    }

}
