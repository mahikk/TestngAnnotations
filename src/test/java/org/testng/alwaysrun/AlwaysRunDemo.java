package org.testng.alwaysrun;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AlwaysRunDemo {
	
	
	
	@Test(description = "this test demonstrate alwaysRun attribute" )
	public void m1() {
		System.out.println("method 1");
		//explicitly failing this test method. so that m2 and m3 will not execute ,since m2 dependent on m1 and m3 dependent on m2
		// m2 and m3 will skip
		Assert.fail();
	}

	//alwaysRun makes test method execute ,  even dependent method failed/skipped
	@Test (dependsOnMethods = {"m1"},alwaysRun = true)
	public void m2() {
		System.out.println("method 2");
	}
	
	@Test (dependsOnMethods = {"m2"},alwaysRun = true)
	public void m3() {
		System.out.println("method 3");
	}

}
