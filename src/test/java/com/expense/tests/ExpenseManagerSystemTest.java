package com.expense.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class ExpenseManagerSystemTest {

	
	@Test
	public void titleTest1() throws Exception{
		WebDriver driver;
		driver = new HtmlUnitDriver();
		driver.get("http://192.168.100.65:8089");
		String expectedTitle = "Login page";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
        System.out.println(actualTitle);
	}
	

}
