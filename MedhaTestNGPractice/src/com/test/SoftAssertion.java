package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void softAssert()
	{
		SoftAssert sa = new SoftAssert();
		System.out.println("In SoftAssert start");
		sa.assertTrue(false);
		System.out.println("In SoftAssert after assert fail");
		//softAssert collects errors in @Test. when encountered with an
		//exception, it will not throw it. So, to make the exception to
		//be thrown, use sa.assertAll() as the last statement in @Test.
		
		sa.assertAll();
		
	}
	
	@Test
	public void hardAssert()
	{
		System.out.println("In hardAssert, start");
		Assert.assertTrue(false);
		System.out.println("In hardAssert, after assert fail");
	}
}
