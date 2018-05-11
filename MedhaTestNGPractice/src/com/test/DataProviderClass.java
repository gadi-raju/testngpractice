package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@Test(dataProvider="testData")
	public void loginTest(String Uid, String Pwd)
	{
		System.out.println("UserName is: " + Uid);
		System.out.println("Password is: " + Pwd);
	}
	
	@DataProvider(name="testData")
	public Object[][] testData()
	{
		Object[][] data = new Object[2][2];
		data[0][0]= "FirstUid";
		data[0][1] = "FirstPwd";
		
		data[1][0] = "SecondUid";
		data[1][1] = "SecondPwd";
		
		return data;
	}

}
