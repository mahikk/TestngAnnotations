package com.testng.reporterlog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportsLogs_BothConsoleAndReports {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
		
		
		
		@Test (priority = 0)
		public void CloseBrowser() {
			driver.close();
			Reporter.log("Driver Closed After Testing",true);
		}
		
		@Test (priority = -1)
		public void OpenBrowser() {
			Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver /n",true);
		        Reporter.log("Launching Google Chrome Driver for this test /n",true); 
		        
		        driver.get("https://www.demoqa.com");
		        
		        Reporter.log("The website used was DemoQA for this test",true);
	  }
}
