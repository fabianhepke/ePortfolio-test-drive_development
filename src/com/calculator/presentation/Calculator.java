package com.calculator.presentation;

import java.util.function.BooleanSupplier;

public class Calculator {

	public boolean isPositive(double d) {
		
		if (d > 0) {
			return true;
		}
		return false;
	}

	public Double power(double d, int i) {
		double result = 1.0;
		
		if (i > 0) {
			while (i > 0) {
				result *= d;
				i--;
			}
		}
		else if (i < 0){
			result = 1 / power(d, i * -1);
		}
		return result;
	}

}
