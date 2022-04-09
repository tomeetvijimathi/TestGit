package com.testngannotation;

import org.testng.annotations.Test;

public class TimeOut {
	@Test(timeOut = 2000)
public void testcase() throws InterruptedException {
		Thread.sleep(3000);
System.out.println("viji");
}
}
