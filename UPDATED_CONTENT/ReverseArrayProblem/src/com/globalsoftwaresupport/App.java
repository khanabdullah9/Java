package com.globalsoftwaresupport;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4};
		
		ReverseArrayProblem problem = new ReverseArrayProblem();
		
		System.out.println(Arrays.toString(problem.solve(nums)));
	}
}
