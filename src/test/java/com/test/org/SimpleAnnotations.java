package com.test.org;


import org.testng.annotations.*;

public class SimpleAnnotations {

	@BeforeSuite
	private void setUp() {
		System.out.println("Set Up");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	private void enterUrl() {
		System.out.println("Enter URl");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("Browser Launch");
	}
	
	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
	
	@Test
	private void searchMobiles() {
		System.out.println("Search Mobiles");
	}
	
	@AfterMethod
	private void logOut() {
		System.out.println("Log Out");
	}
	
	@AfterClass
	private void checkingHomePage() {
		System.out.println("Checking HomePage");
	}
	
	@AfterTest
	private void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}

}

