package com.ex;

import java.util.Scanner;

class NeedBalanceException extends Exception
{
double amount;
public NeedBalanceException(double amount) {
	// TODO Auto-generated constructor stub
	this.amount=amount;
}
}

class ATM
{
double balance;
public void deposit(double amount)
{
balance+=amount;
System.out.println(amount+" Rs deposited..");
}
public void withdrawl(double amount)throws NeedBalanceException
{
if(amount<=balance) {
	balance-=amount;
	System.out.println(amount+" Rs withdrawl successfully..");
}
else {
	double needs = amount-balance;
	throw new NeedBalanceException(needs);
}
}
}

public class CustomException {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter amount for deposit..");
	ATM a1=new ATM();
	double amount = sc.nextDouble();
	
	a1.deposit(amount);
	System.out.println("enter amount for withdrawl..");
	
	amount = sc.nextDouble();
	
	try {
		a1.withdrawl(amount);
	} catch(NeedBalanceException e) {
		
		System.out.println("if you enter "+e.amount+" rs more into your account then you can withdrawl "+amount+" rs..");
	}
	
	
}
}
