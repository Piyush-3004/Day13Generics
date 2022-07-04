package com.bz.mvnp.Generics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	static Integer num1 = new Integer(10);
	static Integer num2 = new Integer(20);
	static Integer num3 = new Integer(30);
	static Integer num4 = new Integer(40);

	static App test;

	@BeforeClass
	public static void init() {

		test = new App(num1, num2, num3, num4);
	}

	@Test
	public void findMaxTest() {
		Integer actual = test.findMax(num1, num2, num3, num4);
		Integer result = 100;
		Assert.assertEquals(result, actual);
	}

}
