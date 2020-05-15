package com.beth.demoProject1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass1 {


	WebDriver driver;
	
	
	
	@BeforeMethod
	public void launchDriver() {
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
	}
	@Test
	public void test1() {
		driver.get("https://www.simplilearn.com");
		//driver.navigate().to("https://www.simplilearn.com/");
		System.out.println("Test 1 title is " +driver.getTitle());
		
	}
	
	@Test
	public void test2() {
		driver.get("https://www.simplilearn.com");
		
		//driver.navigate().to("https://www.simplilearn.com/");
		System.out.println("Test 2 title is " +driver.getTitle());
	}
	
	@Test
	public void test3() {
		driver.get("https://www.simplilearn.com");
		//driver.navigate().to("https://www.simplilearn.com/");
		System.out.println("Test 3 title is " +driver.getTitle());
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	/*
		public static void main(String[] args) throws InterruptedException {
		
			TestClass1 obj = new TestClass1();
			obj.test1();
			obj.test2();
			obj.test2();
			obj.quit();
		
	}*/

}
