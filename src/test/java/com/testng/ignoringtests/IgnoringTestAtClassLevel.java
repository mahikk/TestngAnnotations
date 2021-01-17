package com.testng.ignoringtests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//it will ignore all test methods with in class.
//The @Ignore annotation has a higher priority than individual @Test method annotations. 
//When @Ignore is placed on a class, all the tests in that class will be disabled.

@Ignore
public class IgnoringTestAtClassLevel {

	
	@Test
	public void test1() {
		System.out.println("test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("test 2");
	}
}
