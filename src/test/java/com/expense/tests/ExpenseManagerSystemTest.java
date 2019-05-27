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
		driver.get("http://192.168.100.65:9191");
		String expectedTitle = "Login page";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
        System.out.println(actualTitle);
	}
	

}
