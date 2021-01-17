package org.ornageHRM.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericMethodForDropDownHandle {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
//		selectDropdownvalueByIndex(country, 10);
//		selectDropdownByValue(industry, "health");
//		selectDropdownByVisibleText(industry, "Agriculture / Forestry");
		
//		selectDropdownValue(country, "index", "40");
//		selectDropdownValue(industry, "value", "health");
//		selectDropdownValue(country, "visibletext", "India");
		
		//created enum for type of selection
		
		selectDropdownValue(country, DropDown.INDEX.toString(), "99");
		selectDropdownValue(industry, DropDown.VALUE.toString(), "health");
		selectDropdownValue(country, DropDown.VISIBLETEXT.toString(), "India");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	/**
	 * this is generic method for dropdown selection
	 * @param locator
	 * @param type
	 * @param value
	 */
	public static void selectDropdownValue(By locator,String type, String value) {
		Select select = new Select(getElement(locator));
		
		switch (type) {
		case "value":
			select.selectByValue(value);
			break;
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "visibletext":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("Please pass the correct selection criteira");
			break;
		}
	}
	
	
	public static void selectDropdownvalueByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void selectDropdownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void selectDropdownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
