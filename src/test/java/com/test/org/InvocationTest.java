package com.test.org;

import org.testng.annotations.Test;

public class InvocationTest {

	@Test(invocationCount = 3)
	private void searchMobile() {
		System.out.println("Search Mobiles");
	}

	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");

	}

	@Test(invocationCount = 2)
	private void searchWatch() {
		System.out.println("Search Watch");

	}
}