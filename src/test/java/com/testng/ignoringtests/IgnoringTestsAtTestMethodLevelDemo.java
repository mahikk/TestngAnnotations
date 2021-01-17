package com.testng.ignoringtests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoringTestsAtTestMethodLevelDemo {
	
	@Test
	public void test1() {
		System.out.println("test 1");
	}
	
//it will ignore test2 test method. 
	//When used at the method level @Ignore annotation is functionally equivalent to @Test(enabled=false).
	@Ignore
	@Test
	public void test2() {
		System.out.println("test 2");
	}

	@Test
	public void test3() {
		System.out.println("test 3");
	}
}
