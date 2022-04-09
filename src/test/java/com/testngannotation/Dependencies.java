package com.testngannotation;

import org.testng.annotations.Test;

public class Dependencies {
@Test(enabled=true)
private void highSchool() {
System.out.println("high School");
}
@Test(dependsOnMethods = "highSchool")
private void higherSecondary() {
System.out.println("Higher secondary");
}
@Test(dependsOnMethods = "higherSecondary")
private void engineering() {
System.out.println("college");
}
}
