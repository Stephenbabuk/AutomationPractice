package com.test.org;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Demo {
	
	@Test
	private void searchMobile() {
		System.out.println("Search Mobiles");
	}

	@Ignore
	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}


}
