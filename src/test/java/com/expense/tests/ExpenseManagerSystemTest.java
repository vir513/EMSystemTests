package com.expense.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class ExpenseManagerSystemTest {

	
	@Test
	public void titleTest1(){
		System.out.println("Start1");
		WebDriver driver;
		driver = new HtmlUnitDriver();
		driver.get("http://newtours.demoaut.com/");
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
        System.out.println(actualTitle);
	}
	

}
