package com.test.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

	
	  @Test private void test1() { System.out.println("Test1 Started");
	  Assert.assertEquals("Arun", "ArunKumar");
	  System.out.println("Test1 Completed"); }
	  
	  @Test private void test2() { SoftAssert soft=new SoftAssert();
	  System.out.println("Test2 Started"); soft.assertEquals("Barani", "Baran");
	  System.out.println("Test2 Completed"); soft.assertAll();
	  
	  }
	 
	
	@Test
	private void sample() {
		System.out.println("Assert Started");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stefan\\eclipse-workspace\\AutomationPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals("amazon", driver.getTitle());
		System.out.println("Assert Completed");
		soft.assertAll();

	}
}
