package org.testng.dependson;

import org.testng.annotations.Test;

public class C2 extends C1{

	
	@Test(dependsOnMethods = {"m1"})
	public void m3() {
		System.out.println("method 3");
	}
	
	@Test
	public void m4() {
		System.out.println("mthod 4");
	}
}
