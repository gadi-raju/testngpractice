package com.test;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=0)
	public void zAlphaOrder()
	{
		System.out.println("In Priority 0 test");
		System.out.println("Since priority is set to 0, it should execute first leaving alphabetical order");
	}

	@Test(priority=1)
	public void aAlphaOrder()
	{
		System.out.println("In priority 1 test");
	}
}
