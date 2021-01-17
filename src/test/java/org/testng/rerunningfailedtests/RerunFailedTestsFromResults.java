package org.testng.rerunningfailedtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedTestsFromResults {
	
	
//	testng-failed.xml file will create for failed test methods in test-output folder. we can rerun using this xml file.
	//this file will have all necessary dependencies to rerun the failed test methods
	@Test
	public void test1() {
		System.out.println("test 1 ");
	}
	
	@Test
	public void test2() {
		System.out.println("test 2");
		//Assert.fail();
	}

	@Test
	public void test3() {
		System.out.println("test 3");
	}
}
