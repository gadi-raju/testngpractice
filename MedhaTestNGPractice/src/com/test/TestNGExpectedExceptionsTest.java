package com.test;

import org.testng.annotations.Test;

public class TestNGExpectedExceptionsTest {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void testexception()
	{
		System.out.println("In testException");
		int i = 1/0;
	}

}
