package org.testng.includemethodsexcludemethods;

import org.testng.annotations.Test;

public class IncludeMethods {
	
	@Test
	public void m1Test() {
		System.out.println("method 1");
	}

	@Test
	public void m2Test() {
		System.out.println("method 2");
	}
	
	@Test
	public void m3Test() {
		System.out.println("method 3");
	}
}
