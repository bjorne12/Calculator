package com.project.Calculator_bjorn;
import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;


public class ScientificCalculatorTest{
	
	ScientificCalculator ScientCalc = new ScientificCalculator();
	private static final Logger LOG = Logger.getLogger(ScientificCalculator.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	
	@Test
		public void SquareTestPositive() {
			double firstNumber = 0;
			double result = 0;
			for (int i = 0; i < 50; i++) {
				firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
				result = firstNumber * firstNumber;
				LOG.info("Testing square method with: " + firstNumber + " The result: " + result);
				assertEquals(Math.round(ScientCalc.squareRoot(firstNumber)), Math.round(result), 0.1);
		}
	}
		
		@Test
		public void SquareTestZeros() {
			double firstNumber = 0;
			double result = firstNumber * firstNumber;
			LOG.info("Testing method square with: " + firstNumber);
			assertEquals(Math.round(ScientCalc.squareRoot(firstNumber)), Math.round(result), 1);

	}


		@Test
		public void SquareTestNegativeNumb() {
			double firstNumber = 0;
			double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * -10));
			result = firstNumber * firstNumber;
			LOG.info("Testing method square with: " + firstNumber);
			assertEquals(Math.round(ScientCalc.squareRoot(firstNumber)), Math.round(result), 1);

	}
}

		@Test
		public void SinTestPositivNumb() {
			double firstNumber = 0;
			double result = 0;
			firstNumber = random.nextDouble() * 10;
		
		for (int i = 0; i < 50; i++) {
			result = ScientCalc.SIN(firstNumber);
			LOG.info("Testing method pos SIN with numbers: " + df.format(firstNumber) + " Result: " + result);
			assertEquals(ScientCalc.SIN(firstNumber), result, 0);
	}
}
		@Test
		public void SinTestNegativeNumb() {
			double firstNumber = 0;
			double result = 0;
			firstNumber = random.nextDouble() * -10;
			
			for (int i = 0; i < 50; i++) {
				result = ScientCalc.SIN(firstNumber);
				LOG.info("Testing method Negat SIN with numbers: " + df.format(firstNumber) + "Result:" + result);
				assertEquals(ScientCalc.SIN(firstNumber), result, 0);
			}
		}
		@Test
		public void SinTestZeroNumb() {
			double firstNumber = 0;
			double result = 0;

			for (int i = 0; i < 50; i++) {
				result = ScientCalc.SIN(firstNumber);
				LOG.info("Testing method Zero SIN with numbers: " + df.format(firstNumber) + "Result:" + result);
				assertEquals(ScientCalc.SIN(firstNumber), result, 0);
			}
		}
		
		@Test
		public void TanTestPositivNumb() {
			double firstNumber = 0;
			double result = 0;
			firstNumber = random.nextDouble() * 10;
			
			for (int i = 0; i < 50; i++) {
				result = ScientCalc.TAN(firstNumber);
				LOG.info("Testing method Pos Tan with numbers: " + df.format(firstNumber) + "Result:" + result);
				assertEquals(ScientCalc.TAN(firstNumber), result, 0);
			}
		}

		@Test
		public void TanTestNegativNumb() {
			double firstNumber = 0;
			double result = 0;
			firstNumber = random.nextDouble() * -10;

			for (int i = 0; i < 50; i++) {
				result = ScientCalc.TAN(firstNumber);
				LOG.info("Testing method negative TAN with numbers: " + df.format(firstNumber) + "Result:" + result);
				assertEquals(ScientCalc.TAN(firstNumber), result, 0);
			}
		}

		@Test
		public void TanTestZeroNumb() {
			double firstNumber = 0;
			double result = 0;
			result = ScientCalc.TAN(firstNumber);

			for (int i = 0; i < 50; i++) {
				LOG.info("Testing method negative Tan with numbers: " + df.format(firstNumber) + "Result:" + result);
				assertEquals(ScientCalc.TAN(firstNumber), result, 0);
			}
		}
		@Test
		public void CosTestPositiveNumb() {
			double firstNumber = 0;
			double result = 0;
			firstNumber = random.nextDouble() * 10;
			
			for (int i = 0; i < 50; i++) {
				result = ScientCalc.COS(firstNumber);

				LOG.info("Testing method Pos COS with numbers: " + df.format(firstNumber) + "Result:" + result);
				assertEquals(ScientCalc.COS(firstNumber), result, 0);
			}
		}

		@Test
		public void CosTestNegativeNumb() {
			double firstNumber = 0;
			double result = 0;
			firstNumber = random.nextDouble() * -10;

			for (int i = 0; i < 50; i++) {
				result = ScientCalc.COS(firstNumber);
				LOG.info("Testing method negative COS with numbers: " + df.format(firstNumber) + "Result:" + result);
				assertEquals(ScientCalc.COS(firstNumber), result, 0);
			}
		}

		@Test
		public void CosTestZeroNumbers() {
			double firstNumber = 0;
			double result = 0;
			result = ScientCalc.COS(firstNumber);

			for (int i = 0; i < 50; i++) {
				LOG.info("Testing method zero COS with numbers: " + df.format(firstNumber) + "Result:" + result);
				assertEquals(ScientCalc.COS(firstNumber), result, 0);
			}
		}
		@Test
		public void MathTestPositiveNumb() {
			double firstNumber = 0;
			double result = 0;
			firstNumber = random.nextDouble() * 10;

			for (int i = 0; i < 50; i++) {
				result = ScientCalc.math(firstNumber);

				LOG.info("Testing method Math with numbers: " + df.format(firstNumber) + " Result: " + result);
				assertEquals(ScientCalc.math(firstNumber), result, 0);
			}
		}

		@Test
		public void MathTestNegativeNumb() {
			double firstNumber = 0;
			double result = 0;

			for (int i = 0; i < 50; i++) {
				firstNumber = random.nextDouble() * -10;
				result = ScientCalc.math(firstNumber);

				LOG.info("Testing method Math with numbers: " + df.format(firstNumber) + " Result: " + result);
				assertEquals(ScientCalc.math(firstNumber), result, 0);
			}
		}

		@Test
		public void MathTestZeroNumb() {
			double firstNumber = 0;
			double result = 0;

			for (int i = 0; i < 50; i++) {
				result = ScientCalc.math(firstNumber);

				LOG.info("Testing method Math with numbers: " + df.format(firstNumber) + " Result: " + result);
				assertEquals(ScientCalc.math(firstNumber), result, 0);
			}
		}

		@Test
		public void Math2TestPositiveNumb() {
			double firstNumber = 0;
			double result = 0;

			for (int i = 0; i < 50; i++) {
				firstNumber = random.nextDouble() * 10;
				result = ScientCalc.math2(firstNumber);

				LOG.info("Testing method Math2 with numbers: " + df.format(firstNumber) + " Result: " + result);
				assertEquals(ScientCalc.math2(firstNumber), result, 0);
			}
		}

		@Test
		public void Math2TestNegativeNumb() {
			double firstNumber = 0;
			double result = 0;

			for (int i = 0; i < 50; i++) {
				firstNumber = random.nextDouble() * -10;
				result = ScientCalc.math2(firstNumber);

				LOG.info("Testing method Math2 with numbers: " + df.format(firstNumber) + " Result: " + result);
				assertEquals(ScientCalc.math2(firstNumber), result, 0);
			}
		}

		@Test
		public void Math2TestZeroNumbers() {
			double firstNumber = 0;
			double result = 0;
			for (int i = 0; i < 50; i++) {
				result = ScientCalc.math2(firstNumber);

				LOG.info("Testing method Math2 with numbers: " + df.format(firstNumber) + " Result: " + result);
				assertEquals(ScientCalc.math2(firstNumber), result, 0);
			}
		}
		
}

