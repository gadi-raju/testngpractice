package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.main.HomePage;

public class HomePageTest1 {
	
	HomePage hp;
	
	@BeforeClass()
	public void beforeClass(){
		hp = new HomePage();
		System.out.println("hp: "+ hp);
	}

	@Test()
	public void loginTest()
	{
		assertEquals(hp.doLogin(), "Success");
	}
	
	@Test(dependsOnMethods={"loginTest"})
	public void recordingsTest()
	{
		assertEquals(hp.recordings(), "Playing");
	}
	
	@Test(dependsOnMethods={"recordingsTest"}, alwaysRun=true)
	public void presentationsTest()
	{
		assertEquals(hp.presentations(), 20);
	}
	
	@Test(dependsOnMethods={"loginTest"})
	public void logoutTest()
	{
		assertEquals(hp.doLogout(), "Success");
	}
	
}
