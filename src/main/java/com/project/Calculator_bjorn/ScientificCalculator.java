package com.project.Calculator_bjorn;
import Interfaces.CalculatorAdvancedOperationsInterface;


public class ScientificCalculator implements CalculatorAdvancedOperationsInterface {
	
	
	/**
	 * Detta är olika metoder för att miniräknaren ska göra vissa uträkningar.
	 * 
	 *  squraRoot för att göra roten ur. 
	 */
	

	public double squareRoot(double firstnumber) {
		return Math.pow(firstnumber, 2);
	}

	/**
	 * För att räkna ut upphöjt till 2
	 */
	
	public double math(double firstNumber) {
		return Math.pow(firstNumber, 2);
	}

	/**
	 * För att räkna ut upphöjt till 3
	 */

	public double math2(double firstNumber) {
		return Math.pow(firstNumber, 3);
	}
	
	/**
	 * Beräkning för TAN
	 */

	public double TAN(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.tan(firstNumber);
	}

	/**
	 * Beräkning för SIN
	 */
	
	public double SIN(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.sin(firstNumber);
	}
	/**
	 * Beräkning för COS
	 */
		
	public double COS(double firstNumber) {
		// TODO Auto-generated method stub
		return Math.cos(firstNumber);		
	
	}










	


}
