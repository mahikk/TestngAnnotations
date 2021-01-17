package testngannotations;

import org.testng.annotations.Test;

public class TestClass2 {

	TestClass1 testClass1 = new TestClass1();
	
	@Test(groups = {"B"},dependsOnGroups = {"A"})
	public void class2Test() {
		System.out.println("method 3");
	}
}
