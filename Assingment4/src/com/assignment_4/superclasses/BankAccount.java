/***
 * Klassen BankAccount, superclass i inlämningsuppgift 4
 * 
 * @author Anna-Maja Lithner & Heikki Lyhde
 * @version 1.0
 * @date 2017-11-08
 * 
 */

package com.assignment_4.superclasses;
import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

public class BankAccount implements BankOperations {

	// *** Attributes ***
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;
	
	// *** Constructor ***	
	
	/**
	 * Constructor utan parametrar som slumpar fram ett sexsiffrigt kontonummer
	 * sätter in saldot och kontotypen
	 * 
	 */
	public BankAccount() {
		this.accountNumber = (UUID.randomUUID().toString().substring(0,6));
		this.balance = 0;
		this.accountType = "Bank Account";	
	}
	
	// *** Getters & Setters ***
	
	/**
	 * Hämtar bankkontonummer
	 * @return bankkontonummer
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	
	/**
	 * Hämtar kontotyp
	 * @return kontotyp
	 */
	
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Hämtar saldot på kontot
	 * @return saldo
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Lägger in kontonummer
	 * @param accountNumber lägger in det framslumpade kontonumret
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Lägger in kontotypen
	 * @param accountType kontotyp "BankAccount"
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * Lägger in saldot
	 * @param balance saldo på kontot
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Skriver ut kontonummer, kontotyp och saldot
	 */
	public String toString () {
		return "The account number " + accountNumber + ", Account type: " + accountType + " has balance: " + getBalance()+ "\n";
	}

	// *** Interface implementation ***
	@Override
	/**
	 * Kontrollerar att belopp vid uttag är positivt, annars får man ett felmeddelande
	 */
	public void withdrawMoney(double amount) {
		if (amount>=0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("You can not withdraw a negative /zero value!");
		}
		
		
	}

	@Override
	/**
	 * Kontrollerar att belopp vid insättning är positivt, annars får man ett felmeddelande
	 */
	public void depositMoney(double amount) {
		if (amount>=0) {
			setBalance(getBalance() + amount);
		} else {
			System.out.println("You can not deposit a negative/zero value!");
		}
		
	}

	
}
