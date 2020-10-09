package com.training.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.utils.DriverFactory;
import com.training.utils.DriverNames;
import static com.training.utils.Sleep.sleep; 

class LoginTest {
 
	private WebDriver driver; 
	private String url; 
	
	@BeforeEach
	@DisplayName(value = "To register to the system")
	public void setUp() {
		driver = DriverFactory.getDriver(DriverNames.CHROME); 
		url ="https://react-redux.realworld.io/#/?_k=y4c4m5"; 
	}
	
	@Test
	public void loginTest() {
		// it opens the web page. 
		driver.get(url);
		
		String signUpLink = "//*[@id=\"main\"]/div/nav/div/ul/li[3]/a"; 
		String userNameTxt = "//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[1]/input"; 
		String emailTxt = "//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[2]/input"; 
		String pwdTxt = "//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[3]/input"; 
		String signInBtn = "//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/button"; 
		sleep(2); 
		driver.findElement(By.xpath(signUpLink)).click(); 
		sleep(2); 
		driver.findElement(By.xpath(userNameTxt)).clear(); 
		driver.findElement(By.xpath(userNameTxt)).sendKeys("NaveenKumar");
		sleep(2); 
		driver.findElement(By.xpath(emailTxt)).clear(); 
		driver.findElement(By.xpath(emailTxt)).sendKeys("naveen@probits.in");
		sleep(2); 
		driver.findElement(By.xpath(pwdTxt)).clear();
		driver.findElement(By.xpath(pwdTxt)).sendKeys("Secret"); 
		
	}
	
	
	@AfterEach
	public void tearDown() {
		// close - will close 
		// quity - will close all the tabs 
		sleep(2); 
		driver.close(); 
		 
	}
}
