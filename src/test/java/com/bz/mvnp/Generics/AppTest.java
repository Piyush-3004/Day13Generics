package com.bz.mvnp.Generics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest {
	
	Integer num1 = new Integer(10);
	Integer num2 = new Integer(20);
	Integer num3 = new Integer(30);

	Float floatNum1 = new Float(100.20);
	Float floatNum2 = new Float(20.0);
	Float floatNum3 = new Float(10.10);

	String str1 = "Apple";
	String str2 = "Peach";
	String str3 = "Banana";

	static App test;

	@BeforeClass
	public static void init() {

		test = new App();
	}
	
	@Test 
	public void findMaxTest() {
		Integer actual = test.findMax(num1,num2,num3);
		Integer result = 30;
		Assert.assertEquals(result, actual);
	}
	
	public void maxTestmiddle() {
		int actual = test.findMax(num1, num3, num2);
		int result = 30;
		Assert.assertEquals(result, actual);
	}

	@Test
	public void maxTestAtThird() {
		int actual = test.findMax(num1, num2, num3);
		int result = 30;
		Assert.assertEquals(result, actual);
	}

	@Test
	public void maxFloatTest() {
		float actual = test.findMax(floatNum1, floatNum2, floatNum3);
		float result = 100.20f;
		Assert.assertEquals(result, actual, 0.0);
	}

	@Test
	public void maxFloatTestMiddle() {
		float actual = test.findMax(floatNum2, floatNum1, floatNum3);
		float result = 100.20f;
		Assert.assertEquals(result, actual, 0.0);

	}

	@Test
	public void maxFloatTestAtLast() {
		float actual = test.findMax(floatNum2, floatNum3, floatNum1);
		float result = 100.20f;
		Assert.assertEquals(result, actual, 0.0);

	}

	@Test
	public void maxString() {
		String actual = test.findMax(str3, str2, str1);
		String result = "Banana";
		Assert.assertEquals(result, actual);

	}

	@Test
	public void maxStringMidddle() {
		String actual = test.findMax(str1, str3, str2);
		String result = "Banana";
		Assert.assertEquals(result, actual);
	}

	@Test
	public void maxStringAtLast() {
		String actual = test.findMax(str1, str2, str3);
		String result = "Banana";
		Assert.assertEquals(result, actual);

	}
}
