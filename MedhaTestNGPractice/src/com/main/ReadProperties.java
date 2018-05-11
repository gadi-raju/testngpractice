package com.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public String propertiesExample(String fileName){
		Properties prop = new Properties();
		try{
			FileInputStream inputStream = new FileInputStream("C:/Shanthi/"+fileName);
			prop.load(inputStream);
			System.out.println("city:"+prop.getProperty("city"));
		}catch(IOException e) {
			e.printStackTrace();
	    } 
		return prop.getProperty("city");
	}

}
