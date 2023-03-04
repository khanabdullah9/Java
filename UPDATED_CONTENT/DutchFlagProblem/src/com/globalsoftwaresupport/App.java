package com.globalsoftwaresupport;

public class App {

	public static void main(String[] args) {
		
		int[] nums = {2, 1};
		
		DutchFlagProblem problem = new DutchFlagProblem(nums);
		problem.solve();
		problem.showResult();
	}
}
