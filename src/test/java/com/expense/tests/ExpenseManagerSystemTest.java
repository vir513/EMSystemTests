package com.expense.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExpenseManagerSystemTest {

	/*
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
	*/
	
	@Test
	public void titleTest2() throws Exception{
		System.out.println("Start2");
		WebDriver driver;
		driver = new ChromeDriver();
		Thread.sleep(30000);
		driver.get("http://localhost:9191");
		String expectedTitle = "Login page";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
        System.out.println(actualTitle);
	}


}
