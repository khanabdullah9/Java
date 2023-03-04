package com.globalsoftwaresupport;

public class App {

	public static void main(String[] args) {
		
		int mazeTable[][] = {{1, 1, 1, 1},
			     			 {1, 1, 0, 0},
			     			 {0, 1, 0, 1},
			     			 {1, 1, 1, 1}
		        			};
		
		MazeProblem problem = new MazeProblem(mazeTable);
		problem.solve();
	}
}
