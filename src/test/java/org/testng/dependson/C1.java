package org.testng.dependson;

import org.testng.annotations.Test;

public class C1 {

	
	@Test(dependsOnMethods = {"m2"})
	public void m1() {
		System.out.println("method 1");
	}
	
	@Test
	public void m2() {
		System.out.println("method 2");
	}
}
