package bankaccount;

/**
 * Created by Yanilda on 10/7/2015.
 */
import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args)
    {
        //-----------------------------------------------------------------------------------------------------//
        Account account = new Account( 1234566,65.89 );//create an account,
        //-----------------------------------------------------------------------------------------------------//
        int accntNumb=account.getNumberAccount();//get the account number and assign to acctNumb
        //-----------------------------------------------------------------------------------------------------//
        System.out.printf( "Account number (%d) has balance of: $%.2f\n",accntNumb,account.getBalance() );
        //-----------------------------------------------------------------------------------------------------//
        Scanner input = new Scanner(System.in);//Creates an object type scanner
        //-----------------------------------------------------------------------------------------------------//
        double depositAmount; //declares deposit
        System.out.printf("Enter deposit amount for account number (%d): ", accntNumb );
        depositAmount = input.nextDouble(); //holds input user
        System.out.printf("\n Adding %.2f to account balance \n\n ", depositAmount);
        account.credit(depositAmount);//add amount to account
        //-----------------------------------------------------------------------------------------------------//
        System.out.printf( "account balance: $%.2f\n",account.getBalance() );   //prints new balance
        //-----------------------------------------------------------------------------------------------------//
        double withdrawAmount; //declares withdraw
        System.out.print( "Enter amount to withdraw from account : " );
        withdrawAmount = input.nextDouble(); //assigns user's input
        System.out.printf( "\n Withdrawing %.2f from account balance \n\n ", withdrawAmount );
        account.debit(withdrawAmount);
        //-----------------------------------------------------------------------------------------------------//
        System.out.printf("account new balance: $%.2f\n", account.getBalance()); //print balance
        //-----------------------------------------------------------------------------------------------------//
        System.out.println("All transactions came out smoothly, have a nice day");
    }
}
