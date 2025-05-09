package com.globalsoftwaresupport.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class GameHelperMethods implements Iterator <Integer> {

	public static List<Integer> numbers = new ArrayList<>();
	
	public GameHelperMethods() {
		super();
		gererateRandomNum(6);
	}
	
	public static void gererateRandomNum(int n) {
		for(int i = 1; i <=n; i++) {
			numbers.add(i);
		}
		
		Collections.shuffle(numbers);
	}

	@Override
	public boolean hasNext() {
		return !numbers.isEmpty();
	}

	@Override
	public Integer next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		return numbers.remove(0);
	}

}
