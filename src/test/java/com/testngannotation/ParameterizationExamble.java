package com.testngannotation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExamble {
	@Test
	@Parameters("Name")
private void printName(String name) {
System.out.println("Name is" +name);
}
}
