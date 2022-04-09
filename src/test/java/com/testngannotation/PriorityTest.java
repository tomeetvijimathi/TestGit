package com.testngannotation;

import org.testng.annotations.Test;

public class PriorityTest {
@Test
private void searchTv() {
System.out.println("search tv");
}
@Test(priority = 1,enabled = false)
private void searchMobile() {
System.out.println("search mobile");
}
@Test
private void searchLaptop() {
System.out.println("search laptop");
}
@Test
private void searchAirpods() {
System.out.println("search airpods");
}

}
