package com.example.simplejavalabs_blue;


public class Bankaccounttest {
    String Name;
    String Nric;
    String accountnumber;
    String accounttype;
    double balaced;
    boolean Ativation;

    public Bankaccounttest(String _Name, String _Nric, String _accountnumber, String _accounttype) {
        this.Name = _Name;
        this.Nric = _Nric;
        this.accountnumber = _accountnumber;
        this.accounttype = _accounttype;
        this.balaced = 0.0;
        this.Ativation = false;
    }

    public void Account_ativation()
    { this.Ativation = true; }

    public void credited(double credited_account)
    {this.balaced += credited_account; }

    public void debited(double miuns_from_account)
    {balaced -=miuns_from_account;}

    public double getbalanced()
    {return this.balaced;}
    
}


