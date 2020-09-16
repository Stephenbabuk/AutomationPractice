package com.test.org;

import org.testng.annotations.*;

public class PriorityTest {

	@Test(priority = 2)
	private void searchMobile() {
		System.out.println("Search Mobiles");
	}

	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}

	@Test(priority = 3)

	private void searchWatch() {
		System.out.println("Search Watch");

	}

	@Test(priority = 2)
	private void searchClothes() {
		System.out.println("Search Clothes");
	}
}