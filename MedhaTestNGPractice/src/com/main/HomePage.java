package com.main;

public class HomePage {
	
	public String doLogin(){
		//to-do write automation code using webdriver to click login and enter credentials
		System.out.println("Click login and enter credentials");
		return "Success";
	}
	
	public String recordings(){
		System.out.println("Click on recordings and it shoudl play properly");
		return "Playing";
	}

	public int presentations(){
		System.out.println("Click on presentations and count no. of presentations");
		return 20;
	}
	
	public String doLogout(){
		//to-do write automation code using webdriver to click login and enter credentials
		System.out.println("Click logout");
		return "Success";
	}
}
