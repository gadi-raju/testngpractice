package com.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ReadProperties;

public class PropertiesTest {

	@Test(expectedExceptions=IOException.class)
	public void getCityTest(){
		ReadProperties rp = new ReadProperties();
		Assert.assertEquals("fremont", rp.propertiesExample("properties.txt"));
	}
}
