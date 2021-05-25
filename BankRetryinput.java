package com.example.simplejavalabs_blue;

public class BankRetryinput {

    public static void main(String[]args){

        BankRetry Account1 = new BankRetry("Glenn","T01345567B","123.123.123.1","Svaings","jay tan",500);
        Account1.activation_account();
        Account1.Credited_account(5000.00);
        Account1.debited_account(2000.00);
        Account1.debit_of_Transferaccount(500);

        double Newbalanced = Account1.getBalanced();
        String getaccountname = Account1.accountname();
        String getaccounttype = Account1.setAccounttype();
        Double debit=Account1.transfered;
        System.out.println("Account name " + getaccountname);
        System.out.println("Account type is " + getaccounttype);
        System.out.println("Amount debited from transfer " + debit);
        System.out.println("The Balanced is "+ Newbalanced);

        System.out.println("________________________________________________________");

        BankRetry Account2 = new BankRetry("Jay tan","T1200302B","123_456_789_2","Spendings","N/A",500);
        Account2.activation_account();
        Account2.Credited_account(2000);
        Account2.credited_of_Transferedaccount(500);

        double Newbalanced2 = Account2.getBalanced();
        String getaccountname2 = Account2.accountname();
        String getaccounttype2 = Account2.setAccounttype();
        double credit = Account2.transfered;
        System.out.println("Account name " + getaccountname2);
        System.out.println("Account type is " + getaccounttype2);
        System.out.println("Transfered amount " + credit);
        System.out.println("The Balanced is "+Newbalanced2);
    }
}
