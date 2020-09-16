package com.test.org;

import org.testng.annotations.Test;

public class DependencyTest {

	@Test(dependsOnMethods = "searchWatch")
	private void searchMobile() {
		System.out.println("Search Mobiles");
	}

	@Test(dependsOnMethods = "searchMobile")
	private void searchLaptop() {
		System.out.println("Search Laptop");

	}

	@Test
	private void searchWatch() {
		System.out.println("Search Watch");

	}
}
