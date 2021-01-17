package org.testng.assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAsserttions {
	WebDriver driver;
	@Test
	public void hardAssertionTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.demoqa.com");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//message will display on console only when assertion fail
		Assert.assertEquals(actualTitle, "ToolsQa","Expected and Actual values do not matched");
	}
	
	
	@AfterTest
	public void quit() {
		driver.quit();
		
	}
}
