package com.example.simplejavalabs_blue;

public class BankaccountBLUE2
{
    public static void main(String args[])
    {
        Bankaccountblue account1 = new Bankaccountblue("Derrick","T0131326B","123-123-123-1", "Savings");

        Bankaccountblue account2 = new Bankaccountblue("glenn","T01234567B","123-456-123-1","spending");


        account1.Account_Activation();
        account1.debitaccount(2000);
        account1.creditAccount(8000.00);

        double NewBalance = account1.getBalanced();
        System.out.println("The new balanced for Account 1 is " + NewBalance);

        account2.Account_Activation();
        account2.debitaccount(4000);
        account2.creditAccount(7000);

        double NewBalanced_account2 = account2.getBalanced();
        System.out.println("The new Balanced for Account 2 is " + NewBalanced_account2);

    }
}
