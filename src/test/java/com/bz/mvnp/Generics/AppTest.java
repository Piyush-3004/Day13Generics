package com.bz.mvnp.Generics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	Integer num1 = new Integer(10);
	Integer num2 = new Integer(20);
	Integer num3 = new Integer(30);
	Integer num4 = new Integer(40);

	static App test;

	@BeforeClass
	public static void init() {

		test = new App();
	}

	@Test
	public void findMaxTest() {
		Integer actual = test.findMax(num1, num2, num3, num4);
		Integer result = 100;
		Assert.assertEquals(result, actual);
	}

}
