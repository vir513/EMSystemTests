package com.expense.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class ExpenseManagerSystemTest {
 
WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
	driver = new HtmlUnitDriver();
	}

	@Test
	public void titleTest() {
		driver.get("http://localhost:9191");
		String expectedTitle = "Login page";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
        System.out.println(actualTitle);
	}

	
	@After
	public void tearDown() throws Exception {
	}
  
}
