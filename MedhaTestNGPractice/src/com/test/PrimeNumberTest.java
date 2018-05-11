package com.test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.PrimeNumber;

public class PrimeNumberTest extends BaseTest{
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("In PrimeNumberTest");
		System.out.println("It executes once before every class");
	}

	@AfterClass
	public void afterClass(){
		System.out.println("In PrimeNumberTest");
		System.out.println("It executes once after every class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("In PrimeNumberTest");
		System.out.println("It executes once before every method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("In PrimeNumberTest");
		System.out.println("It executes once after every method");
	}
	
	@Test
	public void isPrime1(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(5);
		assertTrue(result);
		
	}
	
	@Test
	public void isPrime2(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(2);
		assertTrue(result);
		
	}
	
	@Test
	public void isPrime3(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(10);
		assertFalse(result);
		
	}
	
	@Test
	public void isPrime4(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(0);
		assertTrue(result);
		
	}
	
	@Test
	public void isPrime5(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(1);
		assertFalse(result);
		
	}

}
