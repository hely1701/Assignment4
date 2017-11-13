/***
 * Klassen Human, superclass i inlämningsuppgift 4
 * 
 * @author Anna-Maja Lithner & Heikki Lyhde
 * @version 1.0
 * @date 2017-11-08
 * 
 */

package com.assignment_4.superclasses;

public class Human {

	
		
	// *** Attributes ***
	
	private String name = "";
	private int age = 0;
	
		
	// *** Constructor ***
	/**
	 * Constructor med parametrarna name och age
	 * @param name inmatad namn från metoden Main
	 * @param age inmatad ålder från metoden Main
	 */
	public Human(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	// *** Getters & Setters ***
	/**
	 * Hämtar namnet
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Hämtar ålder
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Lägger in namnet
	 * @param name inmatad namn från metoden Main
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Lägger in åldern
	 * @param age inmatad ålder från metoden Main
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
