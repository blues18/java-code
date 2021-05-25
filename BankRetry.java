package com.example.simplejavalabs_blue;

public class BankRetry {
    String name;
    String nric;
    String accountnumber;
    String accounttype;
    String account_to_transfered;
    double balanced;
    double transfered;
    boolean activation;

    public BankRetry(String _name,String _nric, String _accountnumber,String _accounttype, String _account_to_transfered,double _transfered){
        this.name=_name;
        this.nric=_nric;
        this.accountnumber=_accountnumber;
        this.accounttype=_accounttype;
        this.account_to_transfered=_account_to_transfered;
        this.balanced = 0.0;
        this.transfered=_transfered;
        this.activation=false;

    }
    public void activation_account(){
        this.activation=true;

    }public void Credited_account(double Credited){
        this.balanced += Credited;

    }public void debited_account(double debited){
        this.balanced-=debited;

    }public double getBalanced(){
        return this.balanced;

    }public String accountname(){
        return name;

    }public String setAccounttype(){
        return accounttype;

    }public double debit_of_Transferaccount(double debited_amount){
        this.balanced -= debited_amount;
        return this.transfered;

    }public double credited_of_Transferedaccount(double credited_amount){
        this.balanced += credited_amount;
        return this.transfered;
    }
    public String Name_of_transfering_account(){
        return account_to_transfered;
    }

}
