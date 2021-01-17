package testngannotations;

import org.testng.annotations.Test;

public class TestClass1 {

	
	@Test(groups = {"A"} )
	public void class1Test() {
		System.out.println("method 1");
	}
	
	@Test(enabled = true)
	public void c1m2() {
		System.out.println("method 2");
	}
}
