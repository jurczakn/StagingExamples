package com.revature.util;

import com.revature.exception.CalculatorException;
import com.revature.exception.ResultTooLargeException;

public class Calculator <T extends Number> implements CalculatorInterface<T> {

	public T add(T a, T b) throws CalculatorException {
		
		Number result = null;
		
		result = a.doubleValue() + b.doubleValue();
		
		if (!(a instanceof Double) && !(a instanceof Float)) {
		
			result = Math.floor(result.doubleValue());
			result = result.intValue();
			
			if (a.intValue() > 0 && b.intValue() > 0 && (a.intValue() + b.intValue() < 0)) {
				throw new ResultTooLargeException();
			}
		
		}
		
		
		
		return (T) result;
	}

	public T sub(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

	public T mult(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

	public T div(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

	public T sqrt(T a) {
		// TODO Auto-generated method stub
		return null;
	}

	public T pow(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

}
