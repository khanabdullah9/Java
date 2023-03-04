package com.globalsoftwaresupport;

public class App {

	public static void main(String[] args) {
		
		int[] numbers = {3, 4, 5};
		int m = 8;
		
		SubsetSum problem = new SubsetSum(numbers, m);
		problem.solve();
		problem.showResult();
	}
}
