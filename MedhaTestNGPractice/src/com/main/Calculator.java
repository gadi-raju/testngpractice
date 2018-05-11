package com.main;

public class Calculator {

	double result=0.0;
	
	public double doCalc(double a, double b, char ch){
			
		switch(ch){
		case '+': result = a + b;
		break;
		
		case '-': result = a - b;
		break;
		
		case '*': result = a * b;
		break;
		
		case '/': result = a/b;
		break;
		
		case '%': 
			if(b!=0)
			result = a%b;
		break;
		
		}
		
		return  result;
	}
}
