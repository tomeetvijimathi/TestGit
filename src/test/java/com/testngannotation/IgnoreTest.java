package com.testngannotation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
@Test
private void searchMobile() {
System.out.println("search mobile");
}
@Ignore
@Test
private void searchLaptop() {
System.out.println("search laptop");
}
@Test(enabled = false)
private void searchTv() {
System.out.println("search tv");
}
@Test
private void searchAirpods() {
System.out.println("search Airpods");
}
}
