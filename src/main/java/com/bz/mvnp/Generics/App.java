package com.bz.mvnp.Generics;

public class App {

	public int maxNum(Integer a, Integer b, Integer c) {
		if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
			return a;
		else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
			return b;
		else
			return c;
	}
	
	public float maxFloat(Float a, Float b, Float c) {
		if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
			return a;
		else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
			return b;
		else
			return c;
	}
	
	public String maxString(String a, String b, String c) {
		Integer aLen = a.length();
		Integer bLen = b.length();
		Integer cLen = c.length();
		if (aLen.compareTo(bLen) > 0 && aLen.compareTo(cLen) > 0)
			return a;
		if (bLen.compareTo(aLen) > 0 && bLen.compareTo(cLen) > 0)
			return b;
		else
			return c;
	}

}
