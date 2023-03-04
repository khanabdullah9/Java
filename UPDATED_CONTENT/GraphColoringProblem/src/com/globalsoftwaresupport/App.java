package com.globalsoftwaresupport;

public class App {

	public static void main(String[] args) {
		
		int[][] graph = {{0, 1, 1, 1, 0, 0},
						 {1, 0, 1, 0, 1, 1},
						 {1, 1, 0, 1, 0, 1},
						 {1, 0, 1, 0, 0, 1},
						 {0, 1, 0, 0, 0, 1},
						 {0, 1, 1, 1, 1, 0},
		        		};
		
		GraphColoring problem = new GraphColoring(graph, 4);
		problem.solve();
	}
}
