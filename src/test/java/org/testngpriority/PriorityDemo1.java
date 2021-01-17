package org.testngpriority;

import org.testng.annotations.Test;

public class PriorityDemo1 {

	@Test(priority=6)
	public void m1() {
		System.out.println("method 1");
	}
	
	@Test(priority=3)
	public void m2() {
		System.out.println("method 2");
	}
	
	@Test(priority=1)
	public void m3() {
		System.out.println("method 3");
	}
}
