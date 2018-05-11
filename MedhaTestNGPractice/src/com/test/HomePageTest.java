package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.main.HomePage;

public class HomePageTest {
	
	HomePage hp;
	
	//@BeforeClass(groups={"smokeTest", "functionalityTest"})
	@BeforeClass(alwaysRun=true)
	public void beforeClass(){
		hp = new HomePage();
		System.out.println("hp: "+ hp);
	}

	@Test(groups={"smokeTest"})
	public void loginTest()
	{
		assertEquals(hp.doLogin(), "Success");
	}
	
	@Test(groups={"functionalityTest"}, dependsOnGroups={"smokeTest"})
	public void recordingsTest()
	{
		assertEquals(hp.recordings(), "Playing");
	}
	
	@Test(groups={"functionalityTest"})
	public void presentationsTest()
	{
		assertEquals(hp.presentations(), 20);
	}
	
}
