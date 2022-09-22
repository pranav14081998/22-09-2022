package com.exercise.bll;

public interface BankAccount {
	
	double getBalance();
	void deposit(double amount);
	boolean withdraw(double amount);

}
