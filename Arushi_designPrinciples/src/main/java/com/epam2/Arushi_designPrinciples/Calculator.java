package com.epam2.Arushi_designPrinciples;

public abstract class Calculator {
	double firstNumber;
	double secondNumber;
	abstract double add(double firstNumber, double secondNumber);
	abstract double subtract(double firstNumber, double secondNumber);
	abstract double multiply(double firstNumber, double secondNumber);
	abstract double divide(double firstNumber, double secondNumber);

}
