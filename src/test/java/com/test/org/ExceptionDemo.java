package com.test.org;

import org.testng.annotations.Test;

public class ExceptionDemo {

	@Test(expectedExceptions = ArithmeticException.class)
	private void text() {

		int i=10;
		System.out.println(i/0);
	}

}
