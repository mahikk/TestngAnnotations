package org.testngpriority;

import org.testng.annotations.Test;

public class PriorityDemo2 {

	@Test(priority=2)
	public void m1() {
		System.out.println("method 4");
	}
	
	@Test(priority=4)
	public void m2() {
		System.out.println("method 5");
	}
	
	@Test(priority=5)
	public void m3() {
		System.out.println("method 6");
	}


}
