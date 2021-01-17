package org.expectedexception;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExpectedExceptionMessageDemo {

	
	@Test(expectedExceptions = {IOException.class},expectedExceptionsMessageRegExp = "Pass Message test")
	public void exceptionMessageOneTest() throws IOException {
		throw new IOException("Pass Message test");
	}
	
	
	
	@Test (expectedExceptions = {IOException.class}, expectedExceptionsMessageRegExp = ".*Message.*")
	public void exceptionMessageTwoTest() throws IOException {
		throw new IOException("Pass Message test");
	}
	
	
	@Test(expectedExceptions = {IOException.class}, expectedExceptionsMessageRegExp = "Pass Message test")
	public void exceptionMessageThreeTest() throws IOException {
		throw new IOException("Fail Message test");
	}
}
