package com.yahoomail.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MailYahooLogin {

	@Test
	public void yahooMailLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://yahoomail.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login-username")).sendKeys("knathm26@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("Hxxxxxx@2xx1");
		driver.findElement(By.id("login-signin")).click();
		
		String acctName=driver.findElement(By.xpath("//span[text()='nath']")).getText();
		System.out.println(acctName);
		Assert.assertEquals(acctName, "nath");
		
		driver.findElement(By.xpath("//span[text()='nath']")).click();
		driver.findElement(By.linkText("Sign out")).click();
		driver.quit();
	}
}
