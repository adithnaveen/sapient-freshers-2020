package com.training.tests;

import static com.training.utils.Sleep.sleep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.training.pom.RegisterPOM2;
import com.training.utils.DriverFactory;
import com.training.utils.DriverNames; 

class LoginTest2 {
 
	private WebDriver driver; 
	private String url; 
	private RegisterPOM2 rPom; 
	
	@BeforeEach
	@DisplayName(value = "To register to the system")
	public void setUp() {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		rPom = new RegisterPOM2(driver); 
		url ="https://react-redux.realworld.io/#/?_k=y4c4m5";
		
	}
	
	@Test
	public void loginTest() {
		// it opens the web page. 
		driver.get(url);
		rPom.clickSignUpBtn(); 
		rPom.sendUserName("NaveenKumar"); 
		rPom.sendUserEmail("naveen@probits.in");
		rPom.sendUserPassword("Secert");
	}
	
	
	@AfterEach
	public void tearDown() {
		// close - will close 
		// quit - will close all the tabs 
		sleep(2); 
		driver.close(); 
		 
	}
}
