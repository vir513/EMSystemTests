package com.expense.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class ExpenseManagerSystemTest {


	@Test
	public void titleTest() {
		System.out.println("Start");
		WebDriver driver;
		driver = new HtmlUnitDriver();
		Thread.sleep(5000);
		driver.get("http://localhost:9191");
		String expectedTitle = "Login page";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
        System.out.println(actualTitle);
	}

}
