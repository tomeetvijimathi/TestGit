package com.testngannotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
@BeforeSuite
private void setUp() {
System.out.println("setup configuration");
}
@BeforeTest
private void browserLaunch() {
System.out.println("browser launch");
}
@BeforeClass
private void launchUrl() {
System.out.println("launch Url");
}
@BeforeMethod
private void logIn() {
System.out.println("login");
}
@Test
private void searchMobile() {
System.out.println("search mobile");
}
@Test
private void searchLaptop() {
System.out.println("search laptop");
}
@AfterMethod
private void homePage() {
System.out.println("home page");
}
@AfterClass
private void logOut() {
System.out.println("LogOut");
}
@AfterTest
private void closeBrowser() {
System.out.println("Closebrowser");
}
@AfterSuite
private void clearCookies() {
System.out.println("clear cookies");
}
}
