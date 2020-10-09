package com.training.pom;

import static com.training.utils.Sleep.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM2 {

	public RegisterPOM2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//*[@id='main']/div/nav/div/ul/li[3]/a")
	private WebElement signUp;
	
	@FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[1]/input")
	private WebElement userNameTxt; 
	
	@FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[2]/input")
	private WebElement emailTxt; 
	
	@FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[3]/input")
	private WebElement pwdTxt; 
	
	
	@FindBy(xpath ="//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/button" )
	private WebElement signIn; 

	public void clickSignUpBtn() {
		System.out.println("Called clickSignUpBtn");
		this.signUp.click(); 
		sleep(2); 
		
	}

	public void sendUserName(String userName) {
		System.out.println("called sendUserName");
		userNameTxt.clear(); 
		userNameTxt.sendKeys(userName);
	}

	public void sendUserEmail(String email) {
		emailTxt.clear();
		emailTxt.sendKeys(email);
	}

	public void sendUserPassword(String password) {
		pwdTxt.clear(); 
		pwdTxt.sendKeys(password);
	}

}
