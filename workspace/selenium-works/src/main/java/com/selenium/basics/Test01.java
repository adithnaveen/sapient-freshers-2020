package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
	public static void main(String[] args) {
		
		WebDriver driver; 
		
		// 1. locate the driver + driver path
		System.setProperty("webdriver.chrome.driver",
				"/Volumes/Kanchan/MyTrainings/sapient-fresher-2020-sep/drivers/chromedriver");
		// 2. load the driver 
		driver = new ChromeDriver(); 
		// 3. process 
		String URL ="https://msn.com";
		// will open the browser 
		driver.get(URL);
		String webTitle = driver.getTitle(); 
		System.out.println("Title of the site: " +webTitle);
		// 4. close 
		driver.close(); 
	}
}
