package org.testng.rerunningfailedtests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class RerunFailedTestClass2 {

	@Test
	public void test4() {
		System.out.println("test 4");
		//it will display only in TestNG report
		Reporter.log("Test Method test 4 is pass");
		//Assert.fail();
	}
	
	@Ignore
	@Test
	public void test5() {
		System.out.println("test 5");
	}
	
	@Test
	public void test6() {
		System.out.println("test 6");
		//it will display on console as well as in TestNG report
		Reporter.log("Test Method 6 is Pass", true);
	}
}
