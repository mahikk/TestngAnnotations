package org.testng.exclusiongroups;

import org.testng.annotations.Test;

public class ExcludeGroupsDemo {
	
	
	@Test(priority =1,groups = {"functest"})
	public void test1() {
		System.out.println("test 1");
	}

	@Test(priority=4,groups = {"functest","broken"})
	public void test2() {
		System.out.println("test 2");
	}
	
	@Test(priority=3,groups= {"functest"})
	public void test3() {
		System.out.println("test 3");
	}
	
	@Test(priority=2,groups= {"broken"})
	public void test4() {
		System.out.println("test 4");
	}
}
