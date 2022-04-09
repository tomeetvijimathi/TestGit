package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class LoginPageObjects {
	@FindBy(id="username")
	public static WebElement username;
	@FindBy(id="password")
	public static WebElement password;
	@FindBy(id="login")
	public static WebElement loginbutton;
	
	
	
/*public static WebElement username(WebDriver driver) {
	return driver.findElement(By.id("username"));
}
public static WebElement password(WebDriver driver) {
	return driver.findElement(By.id("password"));
}
public static WebElement loginbutton(WebDriver driver) {
	return driver.findElement(By.id("login"));
}*/
}
