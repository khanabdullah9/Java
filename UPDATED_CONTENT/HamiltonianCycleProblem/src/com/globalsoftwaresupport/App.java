package com.globalsoftwaresupport;

public class App {

	public static void main(String[] args) {
		
		int[][] adjacencyMatrix = {{0, 1, 0, 0, 0, 1},
								   {1, 0, 1, 0, 0, 0},
								   {0, 1, 0, 0, 1, 0},
								   {0, 0, 0, 0, 1, 1},
								   {0, 0, 1, 1, 0, 1},
								   {1, 0, 0, 1, 1, 0}
				  			      };
		
		HamiltonianCycle problem = new HamiltonianCycle(adjacencyMatrix);
		problem.solve();
	}
}
