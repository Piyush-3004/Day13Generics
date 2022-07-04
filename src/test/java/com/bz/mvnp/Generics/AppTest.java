package com.bz.mvnp.Generics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	Integer num1 = new Integer(10);
	Integer num2 = new Integer(20);
	Integer num3 = new Integer(30);

	static App test;

	@BeforeClass
	public static void init() {

		test = new App();
	}

	@Test
	public void maxTest() {
		int actual = test.maxNum(num3, num1, num2);
		int result = 30;
		Assert.assertEquals(result, actual);
	}

	@Test
	public void maxTestmiddle() {
		int actual = test.maxNum(num1, num3, num2);
		int result = 30;
		Assert.assertEquals(result, actual);
	}

	@Test
	public void maxTestAtThird() {
		int actual = test.maxNum(num1, num2, num3);
		int result = 30;
		Assert.assertEquals(result, actual);
	}

}
