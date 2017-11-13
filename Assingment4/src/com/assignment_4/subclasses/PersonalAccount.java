/***
 * Klassen PersonalAccount, subclass i inlämningsuppgift 4
 * 
 * @author Anna-Maja Lithner & Heikki Lyhde
 * @version 1.0
 * @date 2017-11-08
 * 
 */

package com.assignment_4.subclasses;
import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

public class PersonalAccount extends BankAccount {

	// *** Constructor ***	
		/**
		 * Constructor utan parametrar som slumpar fram ett sexsiffrigt kontonummer
		 * sätter in saldot och kontotypen
		 */
		public PersonalAccount() {
			this.setAccountNumber (UUID.randomUUID().toString().substring(0,6));
			this.setBalance (0);
			this.setAccountType( "Personal Account");	
		}
}
