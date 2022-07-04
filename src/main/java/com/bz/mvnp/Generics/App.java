package com.bz.mvnp.Generics;

public class App {
	
	
	public <T extends Comparable<T>> T findMax(T element1,T element2,T element3){
		if(element1.compareTo(element2) >0 && element1.compareTo(element3)>0) 
			return element1;
			else if(element2.compareTo(element1) >0 && element2.compareTo(element3)>0)
			return element2;
			else 
				return element3;
	}
	


}
