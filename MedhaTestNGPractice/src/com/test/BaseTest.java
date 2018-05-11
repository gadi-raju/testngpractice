package com.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("It executes before every suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("It executes after every suite");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("It executes before every test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("It executes after every test");
	}

}
