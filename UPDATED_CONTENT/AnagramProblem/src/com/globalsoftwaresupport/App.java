package com.globalsoftwaresupport;

public class App {

	public static void main(String[] args) {
		
		int[] heights = {1,0,2,1,3,1,2,0,3};
		
		TrappedRainProblem problem = new TrappedRainProblem();
		System.out.println(problem.solve(heights));
	}
}
