package com.testngannotation;

import org.testng.annotations.Test;

public class InvocationCount {
@Test(invocationCount = 5)
private void searchTv() {
System.out.println("search tv");
}
@Test(expectedExceptions = Exception.class)
private void searchMobile() {
	int a=10/0;
//System.out.println("search mobile");
}
@Test(priority = -1,invocationCount = 2)
private void searchLaptop() {
System.out.println("search laptop");
}
}
