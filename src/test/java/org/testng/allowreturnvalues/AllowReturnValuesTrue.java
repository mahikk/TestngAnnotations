package org.testng.allowreturnvalues;

import org.testng.annotations.Test;

public class AllowReturnValuesTrue {

//Test methods are annotated with @Test. Methods annotated with @Test that happen to return a value will be ignored, 
//unless we set allow-return-values to true in our testng.xml:
	//We can force to TestNG to change the behavior, but the return value is not displaying in the result/console
	
	@Test(priority=1)
	public String returnMethod() {
		System.out.println("this method return string");
		
		return "returnmethod";
	}
	
	@Test(priority=2)
	public void nonReturnMethod() {
		System.out.println("this method not return any string");
	}
}
