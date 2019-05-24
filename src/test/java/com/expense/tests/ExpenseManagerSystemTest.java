package com.expense.tests;



//import static org.junit.Assert.*;

import static org.testng.AssertJUnit.assertEquals;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ExpenseManagerSystemTest {
 
WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		System.out.println("beforemethod");
	driver = new HtmlUnitDriver();
	}

	@Test
	public void titleTest() {
		System.out.println("testmethod");
		//driver.get("http://newtours.demoaut.com/");
		driver.get("http://localhost:8089");
		String expectedTitle = "Login page";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
        System.out.println(actualTitle);
	}

	
	@AfterTest
	public void tearDown() throws Exception {
	}

	  
	  
  
}
