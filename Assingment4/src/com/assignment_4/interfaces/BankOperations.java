/***
 * Interface till inlämningsuppgift 4
 * 
 * @author Anna-Maja Lithner & Heikki Lyhde
 * @version 1.0
 * @date 2017-11-08
 * 
 */

package com.assignment_4.interfaces;

public interface BankOperations {
	
	/***
	 * Metod för uttag av pengar från ett bankkonto.
	 * implementeras i klassen BankAccount
	 * @param amount av typen double
	 */
	public void withdrawMoney(double amount);
	
	/***
	 * Metod för insättning av pengar till ett bankkonto.
	 * implementeras i klassen BankAccount
	 * @param amount av typen double
	 */
	
	public void depositMoney(double amount);
	
}
