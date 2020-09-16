package com.test.org;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.IDCS.AutomationPractice.BaseClass;
import com.automation.pom.HomePage;

public class AutomationPractice extends BaseClass {
	
	public static WebDriver driver;

	//public static void main(String[] args) throws InterruptedException {

	
	@Test
	public void sample() throws InterruptedException {
	
		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Stefan\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 */
		//driver.get("http://automationpractice.com/index.php");
		
		HomePage hp=new HomePage(driver);

		Thread.sleep(2000);
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		clickonElement(signIn);
		//signin.click();

		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		inputValuesToElements(email, "stefanpractice@gmail.com");
		
		//email.sendKeys("stefanpractice@gmail.com");

		Thread.sleep(2000);
		WebElement pswd = driver.findElement(By.id("passwd"));
		inputValuesToElements(pswd, "12345");
		//pswd.sendKeys("12345");

		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		clickonElement(submit);
		//submit.click();

		Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions ac = new Actions(driver);
		moveToElement(title);
		
		//ac.moveToElement(title).perform();

		Thread.sleep(2000);
		WebElement tshirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
		ac.moveToElement(tshirt).perform();
		tshirt.click();

		Thread.sleep(2000);
		WebElement block = driver.findElement(By.xpath("//li[contains(@class,'ajax_block_product ')]"));
		ac.moveToElement(block).perform();

		/*
		 * Thread.sleep(2000); WebElement view =
		 * driver.findElement(By.xpath("//a[@class='quick-view']"));
		 * ac.moveToElement(view).perform(); view.click();
		 */

		Thread.sleep(2000);
		WebElement button = driver
				.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
		ac.moveToElement(button).perform();
		button.click();

		Thread.sleep(2000);
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		ac.moveToElement(proceed).perform();
		proceed.click();

		Thread.sleep(2000);
		WebElement proceed1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		ac.moveToElement(proceed1).perform();
		proceed1.click();

		Thread.sleep(2000);
		WebElement proceed2 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		// ac.moveToElement(proceed2).perform();
		proceed2.click();

		Thread.sleep(2000);
		WebElement chkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		chkbox.click();

		Thread.sleep(2000);
		WebElement proceed3 = driver
				.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		proceed3.click();

	}
}
