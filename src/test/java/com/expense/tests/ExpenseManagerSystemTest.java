package com.expense.tests;

import static org.junit.Assert.*;

import org.junit.Test;

//import static org.testng.Assert.assertEquals;

//import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class ExpenseManagerSystemTest {


	@Test
	public void titleTest() throws Exception{
		System.out.println("Start");
		WebDriver driver;
		driver = new HtmlUnitDriver();
		//Thread.sleep(5000);
		driver.get("http://localhost:9191");
		String expectedTitle = "Login page";
		String actualTitle = driver.getTitle();
		System.out.println("Expected: " + expectedTitle);
		System.out.println("Actual: " + actualTitle);
		assertEquals(expectedTitle, actualTitle);
        System.out.println(actualTitle);
	}

}
