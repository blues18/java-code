package com.example.simplejavalabs_blue;

public class Bankaccountblue{
        String name;
        String NRIC;
        String AccountNumber;
        String Account_Type;
        double Balanced;
        boolean Activation;

    public Bankaccountblue(String _name,String _NRIC,String _AccountNumber,String _Account_Type)
    {
        this.name =_name;
        this.NRIC = _NRIC;
        this.AccountNumber=_AccountNumber;
        this.Account_Type=_Account_Type;
        this.Balanced=0.0;
        this.Activation = false;
    }
    public void Account_Activation()
    {
    this.Activation=true;
    }
    public void debitaccount(double debitamount)
    {
    this.Balanced -= debitamount;
    }
    public void creditAccount(double AmountToCredit)
    {
    this.Balanced += AmountToCredit;
    }
    public double getBalanced()
    {
    return this.Balanced;
    }
}
