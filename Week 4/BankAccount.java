/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umer
 */
public class BankAccount
{
    double balance;
    
    public BankAccount(double n)
    {
        balance = n;
    }
    
    public BankAccount()
    {
        balance = 100.0;
    }
    
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public String toString()
    {
        return "The balance is " + balance;
    }
    
    public void setBalance(double value)
    {
        balance = value;
    }
    
    public double getBalance()
    {
        return balance;
    }
}
