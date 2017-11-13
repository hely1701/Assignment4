/***
 * Klassen BankCustomer, subclass i inlämningsuppgift 4
 * 
 * @author Anna-Maja Lithner & Heikki Lyhde
 * @version 1.0
 * @date 2017-11-08
 * 
 */
package com.assignment_4.subclasses;
import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

public class BankCustomer extends Human{

	// *** Attributes ***
	
	private ArrayList <BankAccount> customerAccounts = new ArrayList <BankAccount>();
	
		
	// *** Constructor ***
	/**
	 * Constructor med parametrarna name, age och bankAccounts
	 * @param name kundens namn
	 * @param age kundens ålder
	 * @param bankAccounts lista över kundens konton
	 */
	public BankCustomer(String name, int age, ArrayList<BankAccount> bankAccounts) {
		super(name, age);
		this.customerAccounts = customerAccounts;
	}


	// *** Getters & Setters ***
	/**
	 * Hämtar kundens kontouppgifter
	 * @return customerAccounts
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * Lägger in kundens kontouppgifter
	 * @param customerAccounts kontouppgifter
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	// *** Add Account ***
	/**
	 * Lägger till ett konto
	 * @param bankAccount kontouppgifter
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);
		
	}
	
	/**
	 * 
	 * Sätter in belopp på kontot
	 * @param accountNumber kontonummer
	 * @param amount belopp
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}
	
	/**
	 * 
	 * Tar ut belopp från kontot
	 * @param accountNumber kontonummer
	 * @param amount belopp
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}
	
	/**
	 * Skriver ut kundens kontouppgifter med namn, ålder, kontonummer, kontotyp och saldo
	 */
	public String toString () {
		
				
		String result = "Customer: [" + getName() + "\tAge: " + getAge() + "\n";
			for (int i = 0; i < customerAccounts.size(); i++) {
				result += customerAccounts.get(i).toString()+ "\n";
			
			}
		
			return result;
	}

	
}
