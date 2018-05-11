package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.Calculator;

public class CalculatorTest extends BaseTest{
	
//	@BeforeClass
//	public void beforeClass(){
//		System.out.println("In CalculatorTest");
//		System.out.println("It executes once before every class");
//	}
//
//	@AfterClass
//	public void afterClass(){
//		System.out.println("In CalculatorTest");
//		System.out.println("It executes once after every class");
//	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("In CalculatorTest");
		System.out.println("It executes once before every method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("In CalculatorTest");
		System.out.println("It executes once after every method");
	}
	
	@DataProvider(name="testData")
	public Object[][] getData(){
		Object[][] data = {{2.0,3.0,'+',5.0},{3.0,0.0,'*',0.0},{5.0,2.0,'-',3.0}};
		return data;
	}
	
	@Test(dataProvider="testData")
	public void doCalcTest1(double a, double b, char c, double result){
		Calculator calc = new Calculator();
		double actual = calc.doCalc(a, b, c);
		assertEquals(actual, result);
	}
	
//	@Test
//	public void doCalcTest2(){
//		Calculator calc = new Calculator();
//		double actual = calc.doCalc(-40.0, 20.0, '*');
//		assertEquals(actual, -800.0);
//	}
//	
//	@Test
//	public void doCalcTest3() {
//		Calculator calc = new Calculator();
//		double actual = calc.doCalc(0, 0, '%');
//		assertEquals(actual, 0.0);
//	}
//	
//	@Test
//	public void doCalcTest4(){
//		Calculator calc = new Calculator();
//		double actual = calc.doCalc(40.34,0, '*');
//		assertEquals(actual, 0.0);
//	}
//	
//	@Test
//	public void doCalcTest5(){
//		Calculator calc = new Calculator();
//		double actual = calc.doCalc(40.0, 20.0, '-');
//		assertEquals(actual, 20.0);
//	}
	
}
