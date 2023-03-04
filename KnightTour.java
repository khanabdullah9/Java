import java.util.Scanner;

public class KnightTour {

	private int[][] solutionMatrix;
	private int[] xMoves = { 2, 1, -1, -2, -2, -1, 1, 2 };
	private int[] yMoves = { 1, 2, 2, 1, -1, -2, -2, -1 };
    private int boardSize;

	public KnightTour(int boardSize) {
        this.boardSize = boardSize;
		this.solutionMatrix = new int[boardSize][boardSize];
		initializeBoard();
	}

	private void initializeBoard() {
		for (int i = 0; i < this.boardSize; ++i)
			for (int y = 0; y < this.boardSize; ++y)
				this.solutionMatrix[i][y] = Integer.MIN_VALUE;
	}

	public void solveKnightTourProblem() {

		this.solutionMatrix[0][0] = 0;

		if ( !solveProblem(1, 0, 0) ) {
			System.out.println("No feasible solution found...");
			return;
		}
		 
		showSolution();	
	}

	public boolean solveProblem(int stepCount, int x, int y) {

		if (stepCount == this.boardSize * this.boardSize) {
			return true;
		}

		for (int i = 0; i < xMoves.length; ++i) {

			int nextX = x + xMoves[i];
			int nextY = y + yMoves[i];

			if ( isValidMove(nextX, nextY) ) {

				this.solutionMatrix[nextX][nextY] = stepCount;

				if ( solveProblem(stepCount + 1, nextX, nextY) ) {
					return true; // good solution, keep going
				}

				this.solutionMatrix[nextX][nextY] = Integer.MIN_VALUE; // remove from solutions --> backtracking
			}
		}

		return false;
	}

	public boolean isValidMove(int x, int y) {

		if (x < 0 || x >= this.boardSize) return false;
		if (y < 0 || y >= this.boardSize) return false;
		if (this.solutionMatrix[x][y] != Integer.MIN_VALUE) return false;

		return true;
	}

	public void showSolution() {
		for (int i = 0; i < this.boardSize; ++i) {
			for (int j = 0; j < this.boardSize; ++j) {
				System.out.print(this.solutionMatrix[i][j] + " ");
			}

			System.out.println();
		}
	}
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
        KnightTour problem = new KnightTour(input);
        problem.solveKnightTourProblem();
    }
}
