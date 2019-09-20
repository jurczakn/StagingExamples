package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.exception.ResultTooLargeException;
import com.revature.util.Calculator;
import com.revature.util.CalculatorInterface;

public class CalculatorTest {
	
	private CalculatorInterface<Integer> intCalc;  
	private CalculatorInterface<Double> doubleCalc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		intCalc = new Calculator<Integer>();
		doubleCalc = new Calculator<Double>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddTwoPositiveNumbers() {
		Integer result = intCalc.add(1, 1);
		assertEquals("1 + 1 should = 2", new Integer(2), result);
	}

	@Test
	public void testAddTwoPositiveDoubles() {
		Double result = doubleCalc.add(1.1, 1.1);
		assertEquals("1.1 + 1.1 should = 2.2", new Double(2.2), result);
	}
	
	@Test(expected = ResultTooLargeException.class)
	public void addTooLargeIntegers() {
		Integer result = intCalc.add(Integer.MAX_VALUE, 1);
		//System.out.println((result));
	}
}
