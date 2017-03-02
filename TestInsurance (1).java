package com.example.tests;

public class TestInsurance {

	public static void main(String[] args){
		Policy chrisAccount = new Policy(123,1, true, 0);
		chrisAccount.payPremium(1000.0);
		chrisAccount.getBalance();
		
	}
}
