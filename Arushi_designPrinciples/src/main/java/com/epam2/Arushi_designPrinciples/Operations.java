package com.epam2.Arushi_designPrinciples;

import java.util.Scanner;

public class Operations extends Calculator     {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Operations obj =new Operations();
		String st;
		double firstNumber=sc.nextDouble();
		double secondNumber=sc.nextDouble();
		while(true)
		{
			st=sc.next();
			if(st.equalsIgnoreCase("add"))
			{
				firstNumber=obj.add(firstNumber, secondNumber);
			}
			else if(st.equalsIgnoreCase("divide"))
			{
				firstNumber=obj.subtract(firstNumber, secondNumber);

			}
			else if(st.equalsIgnoreCase("multiply"))
			{
				firstNumber=obj.multiply(firstNumber, secondNumber);

			}
			else if(st.equalsIgnoreCase("divide"))
			{
				firstNumber=obj.divide(firstNumber, secondNumber);

			}
			else
			{
				break;
			}
			System.out.println("Type y to continue calculations otherwise any key othr than y to see the result");
			String checker=sc.next();
			if(checker.charAt(0)=='y')
			{}
			else
				break;
			
			secondNumber=sc.nextDouble();
			
		}
		System.out.println("Result is "+ firstNumber);
		sc.close();
	}

	@Override
	double add(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber+secondNumber;
	}

	@Override
	double subtract(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber-secondNumber;
	}

	@Override
	double multiply(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber*secondNumber;
	}

	@Override
	
	double divide(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		if(secondNumber==0.0d)
		{
			System.out.println("Division by 0 is not allowed");
			return -1;
		}
		return firstNumber/secondNumber;

	}
	

}
