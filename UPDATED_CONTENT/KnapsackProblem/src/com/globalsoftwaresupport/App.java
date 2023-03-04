package com.globalsoftwaresupport;

public class App {

	public static void main(String[] args) {
		
		int numOfItems = 4;
		int capacityOfKnapsack = 7;
		
		int[] weightOfItems = {0, 1, 3, 4, 5};
		int[] profitOfItems = {0, 1, 4, 5, 7};
		
		KnapsackProblem problem = new KnapsackProblem(numOfItems, capacityOfKnapsack,
				weightOfItems, profitOfItems);
		problem.solve();
		problem.showResult();
	}
}
