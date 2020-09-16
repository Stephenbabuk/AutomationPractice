package com.test.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleIRetry {

	@Test
	private void test1() {
		System.out.println("Test1 Started");
		Assert.assertEquals("A", "a");
		System.out.println("Test1 Completed");
	}

	@Test(retryAnalyzer = MyRetry.class)
	private void test2() {
		System.out.println("Test2 Started");
		Assert.assertEquals("B", "b");
		System.out.println("Test2 Completed");

	}
}