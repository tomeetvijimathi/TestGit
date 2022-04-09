package com.testngannotation;

import org.testng.annotations.Test;

public class GroupingExamble {
@Test(groups= {"Apple"})
	private void apple1() {
System.out.println("Apple Testing");
}
@Test(groups= {"Apple"})
private void apple2() {
System.out.println("Apple Testing");
}
@Test(groups= {"Moto"})
private void moto1() {
System.out.println("Moto Testing");
}
@Test(groups= {"Moto"})
private void moto2() {
	System.out.println("Moto Testing");
}
@Test(groups= {"vivo"})
private void vivo1() {
System.out.println("vivo testing");
}
@Test(groups= {"vivo"})
private void vivo2() {
	System.out.println("vivo testing");
}
}

