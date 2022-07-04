package com.bz.mvnp.Generics;

public class App<T extends Comparable<T>> {

	T element1;
	T element2;
	T element3;
	T element4;


	public App(T element1, T element2, T element3, T element4) {
		this.element1 = element1;
		this.element2 = element2;
		this.element3 = element3;
		this.element4 = element4;
	}

	public static <T extends Comparable<T>> T findMax(T element1, T element2, T element3, T element4) {
		if (element1.compareTo(element2) >= 0 && element1.compareTo(element3) >= 0
				&& element1.compareTo(element4) >= 0) {

			System.out.println(" element1 is Largest ");
			return element1;
		} else if (element2.compareTo(element1) >= 0 && element2.compareTo(element3) >= 0
				&& element2.compareTo(element4) >= 0) {
			System.out.println(" element2 is Largest");
			return element2;
		} else if (element3.compareTo(element1) >= 0 && element3.compareTo(element2) >= 0
				&& element3.compareTo(element4) >= 0) {
			System.out.println(" element3 is Largest");
			return element3;
		} else {
			System.out.println("element4 is Largest");
			return element4;
		}
	}

	public Object findMax() {
		T max = findMax(this.element1, this.element2, this.element3, this.element4);
		printMax(max);
		findMax(this.element1, this.element2, this.element3, this.element4);
		return max;
	}

	public void printMax(T max) {
		System.out.println("App Value: " + max);
	}

}