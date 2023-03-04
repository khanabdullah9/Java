package com.globalsoftwaresupport;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> items = Arrays.asList(3,2,4);
		int binCapacity = 10;
		
		FirstFitDecreasingAlgorithm algorithm = new FirstFitDecreasingAlgorithm(items, binCapacity);          
		algorithm.solve();
		algorithm.showResults();
	}
}
