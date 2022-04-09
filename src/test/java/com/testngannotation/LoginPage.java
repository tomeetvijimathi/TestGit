package com.testngannotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodel.LoginPageObjects;

public class LoginPage {
@Test
	public void loginTestCase() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venba\\eclipse-workspace\\TestNG_Project\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	
	/*
	 * LoginPageObjects.username(driver).sendKeys("vijimathi");
	 * LoginPageObjects.password(driver).sendKeys("vijimathi");
	 * LoginPageObjects.loginbutton(driver).click();
	 */
	
	
	PageFactory.initElements(driver, LoginPageObjects.class);
	LoginPageObjects.username.sendKeys("vijimathi");
	LoginPageObjects.password.sendKeys("vijimathi");
	LoginPageObjects.loginbutton.click();
	
	
	
	
	
	
	
	/*
	 * WebElement username = driver.findElement(By.id("username"));
	 * username.sendKeys("vijimathi"); WebElement password =
	 * driver.findElement(By.id("password")); password.sendKeys("vijimathi");
	 * WebElement loginbutton = driver.findElement(By.id("login"));
	 * loginbutton.click();
	 */
	}
}
