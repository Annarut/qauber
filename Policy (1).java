package com.example.tests;

public class Policy {

	
	private int PolicyNumber;
	private boolean isActive;
	private double Balance;
	private int Term;
    
	
	public Policy(int PolicyNumber, int Term, boolean isActive, double Balance){
		this.PolicyNumber = PolicyNumber;
		this. isActive = isActive;
		this.Balance = Balance;
		this.Term = Term;
	}
public void payPremium(double amount)
{
	Balance = Balance + amount;
}
public void getBalance(){
     System.out.println(Balance);	
}
	}
