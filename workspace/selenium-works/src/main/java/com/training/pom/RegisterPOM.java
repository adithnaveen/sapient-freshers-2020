package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPOM {

	private WebDriver driver;

	public RegisterPOM(WebDriver driver) {
		this.driver = driver;
	}

	String signUpLink = "//*[@id=\"main\"]/div/nav/div/ul/li[3]/a";
	String userNameTxt = "//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[1]/input";
	String emailTxt = "//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[2]/input";
	String pwdTxt = "//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[3]/input";
	String signInBtn = "//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/button";

	public void clickSignUpBtn() {
		driver.findElement(By.xpath(signUpLink)).click();
	}

	public void sendUserName(String userName) {
		driver.findElement(By.xpath(userNameTxt)).clear();
		driver.findElement(By.xpath(userNameTxt)).sendKeys(userName);
	}

	public void sendUserEmail(String email) {
		driver.findElement(By.xpath(emailTxt)).clear();
		driver.findElement(By.xpath(emailTxt)).sendKeys(email);
	}

	public void sendUserPassword(String password) {
		driver.findElement(By.xpath(pwdTxt)).clear();
		driver.findElement(By.xpath(pwdTxt)).sendKeys(password);
	}

}
