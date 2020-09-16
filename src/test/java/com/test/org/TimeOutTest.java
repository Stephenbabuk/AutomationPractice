package com.test.org;

import org.testng.annotations.Test;

public class TimeOutTest {

	@Test(timeOut = 3000)
	private void searchMobile() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Search Mobiles");
	}

	@Test(timeOut = 3000)
	private void searchLaptop() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Search Laptop");

	}

}
