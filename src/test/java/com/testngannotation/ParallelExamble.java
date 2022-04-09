package com.testngannotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExamble {
	@Test
private void openGoogle() {
System .setProperty("Webdriver.chrome.driver", "C:\\Users\\Venba\\eclipse-workspace\\TestNG_Project\\Driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com/");
}
	@Test
private void openBing() {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venba\\\\eclipse-workspace\\\\TestNG_Project\\\\Driver\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.bing.com/");
	}
}
