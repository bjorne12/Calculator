package com.project.Calculator_bjorn;

import Interfaces.CalculatorBasicOperationsInterface;


public class SimpleCalculator implements CalculatorBasicOperationsInterface {

	/**
	 * Här är olika metoder för att räkna ut simplare uträkningar för miniräknaren. 
	 * 
	 * Här räknar den ut addition
	 */
	
	
	public double addition(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber + secondNumber;
	}
	
	/**
	 * Här beräknar den subtraktion mellan de två talen
	 */

	public double substraction(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber - secondNumber;
	}
	/**
	 * Metod för multiplikation
	 */

	public double multiplication(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber * secondNumber;
	}
	/**
	 * Metod för division
	 */

	public double division(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber / secondNumber;
	}
}

