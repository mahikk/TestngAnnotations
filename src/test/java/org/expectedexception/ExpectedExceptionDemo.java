package org.expectedexception;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExpectedExceptionDemo {
	//there can be certain scenarios 
	//where we need to verify that an exception is being thrown by the program during execution.

	@Test(expectedExceptions = {IOException.class})
	public void exceptionOneTest() throws Exception {
		throw new IOException();
	}
	
	@Test(expectedExceptions = {IOException.class, NullPointerException.class})
	public void exceptionTwoTest() throws Exception {
		throw new Exception();
	}
}
