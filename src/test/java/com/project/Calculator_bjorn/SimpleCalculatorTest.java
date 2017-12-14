package com.project.Calculator_bjorn;
import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;




public class SimpleCalculatorTest {
	
	SimpleCalculator SimpCalc = new SimpleCalculator();
	private static final Logger LOG = Logger.getLogger(ScientificCalculator.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	
	
	@Test
	public void AdditionTestPositivNumb() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber + secondNumber;

			LOG.info("Testing method Addition with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(SimpCalc.addition(firstNumber, secondNumber)), result, 1);
}

	}
	
	@Test
	public void AdditionTestNegativeNumb() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber + secondNumber;

			LOG.info("Testing method Addition with: " + firstNumber + " and "
					+ secondNumber + " result " + result);
			assertEquals(SimpCalc.addition(firstNumber, secondNumber),result, 1);
		}
	}
	
	@Test
	public void AdditionTestZeroNumb() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
			result = firstNumber + secondNumber;

			LOG.info("Testing Addtion method with: " + firstNumber + " and " + secondNumber + "result:" + result);
			assertEquals(SimpCalc.addition(firstNumber, secondNumber),result, 1);			
		}
	}
	
	@Test
	public void SubtracktTestPositivNumb() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber - secondNumber;

			LOG.info("Testing Substraction method: " + firstNumber + " and "
					+ secondNumber + "result:" + result);
			assertEquals(SimpCalc.substraction(firstNumber, secondNumber),result, 1);
		}
	}
	@Test
	public void SubstractionTestNegativeNumb() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber - secondNumber;

			LOG.info("Testing Substraction method with: " + firstNumber + " and "
					+ secondNumber + "result:" + result);
			assertEquals(SimpCalc.substraction(firstNumber, secondNumber),result, 1);
		}
	}
	@Test
	public void SubstractionTestZeroNumb() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
			result = firstNumber - secondNumber;

			LOG.info("Testing Substraction method with: " + firstNumber + " and " + secondNumber + "result:" + result);
			assertEquals(SimpCalc.substraction(firstNumber, secondNumber),result, 1);			
		}
	}
	@Test
	public void MultiplyTestPositiveNumb() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber * secondNumber;

			LOG.info("Testing Multiply method with: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(SimpCalc.multiplication(firstNumber, secondNumber),result, 1);
		}
	}
	@Test
	public void MultiplyTestNegativeNumb() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
			result = firstNumber * secondNumber;

			LOG.info("Testing Multiply method with: " + firstNumber + " and "
					+ secondNumber + "result:" + result);
			assertEquals(SimpCalc.multiplication(firstNumber, secondNumber),result, 1);
		}
	}
	@Test
	public void MultiplyTestZeroNumb() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		
		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
			result = firstNumber * secondNumber;

			LOG.info("Testing Multiply method with: " + firstNumber + " and " + secondNumber + "result:" + result);
			assertEquals(SimpCalc.multiplication(firstNumber, secondNumber),result, 1);			
		}
	}
	@Test
	public void DivisionTestPositiveNumb() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber / secondNumber;

			LOG.info("Testing Division method with: " + firstNumber + " and "
					+ secondNumber + "result:" + result);
			assertEquals(SimpCalc.division(firstNumber, secondNumber),result, 1);
		}
	}
	@Test
	public void DivisionTestNegativeNumb() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber / secondNumber;

			LOG.info("Testing Division method with: " + firstNumber + " and "
					+ secondNumber + "result:" + result);
			assertEquals(SimpCalc.division(firstNumber, secondNumber),result, 1);
		}
	}
	@Test
	public void DivisionTestZeroNumb() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result =  0;
	
		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (10)));;
			secondNumber = 0;
			result = firstNumber / secondNumber;

			LOG.info("Testing Division method with: " + firstNumber + " and " + secondNumber + "result:" + result);
			assertEquals(SimpCalc.division(firstNumber, secondNumber),result, 1);			
		}
	}
}