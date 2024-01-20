package com.application;

/***
 * @author Frank
 */
public class MortgageCalculatorApp {

	public static void main(String[] args) {
		
		System.out.println("Mortgage Calculator applicaion is starting ...");
		
		Addition add = new Addition();
		int result =  add.add(5, 8);
		System.out.println("x + y = Result: ---> " + result);
	}
}
