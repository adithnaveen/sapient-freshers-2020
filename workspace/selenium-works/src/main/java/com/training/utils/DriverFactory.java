package com.training.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	private static WebDriver driver; 
	
	public static WebDriver getDriver(DriverNames driverName) {
		if(driverName.equals(DriverNames.CHROME)) {
			System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
			
			driver = new ChromeDriver(); 
		} else if(driverName.equals(DriverNames.FIREFOX)) {
			
		} 
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		return driver; 
	}
	
	
}
