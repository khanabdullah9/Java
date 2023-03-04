public class Maze {
    private int[][] maze;
    private int[][] solution;
    private int mazeSize;

    public Maze(int[][] maze)
    {
        this.maze = maze;
        this.mazeSize = maze.length;
        this.solution = new int[mazeSize][mazeSize];
    }

    public void Solve()
    {
        if(SolveProblem(0,0))
        {
            ShowSolution();
        }
        else
        {
            System.out.println("There is no solution");
        }
    }
    private boolean SolveProblem(int rowIndex, int colIndex)
    {
        if(isFinished(rowIndex,colIndex))
        {
            return true;
        }
        if(isValid(rowIndex, colIndex))
        {
            solution[rowIndex][colIndex] = 1;
            if(SolveProblem(rowIndex, colIndex+1))
            {
                return true;
            }
            if(SolveProblem(rowIndex+1, colIndex))
            {
                return true;
            }
            // if(SolveProblem(rowIndex, colIndex-1))
            // {
            //     return true;
            // }
            // if(SolveProblem(rowIndex-1, colIndex))
            // {
            //     return true;
            // }
            //backtrack
            solution[rowIndex][colIndex] = 0;
        }
        return false;
    }
    private boolean isValid(int rowIndex, int colIndex)
    {
        if(rowIndex < 0 || rowIndex >= mazeSize)
        {
            return false;
        }
        if(colIndex < 0 || colIndex >= mazeSize)
        {
            return false;
        }
        if(this.maze[rowIndex][colIndex] == 0)
        {
            return false;
        }
        return true;
    }
    
    private boolean isFinished(int rowIndex, int colIndex)
    {
        if(rowIndex == mazeSize-1 && colIndex == mazeSize-1)
        {
            solution[rowIndex][colIndex] = 1;
            return true;
        }
        return false;
    }
    private void ShowSolution()
    {
        for(int i=0;i<mazeSize;++i)
        {
            for(int j=0;j<mazeSize;++j)
            {
                if(solution[i][j] == 1)
                {
                    System.out.print(" S ");
                }
                else
                {
                    System.out.print(" - ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        int maze[][] = {{1,1,1,1},
                        {1,0,1,0},
                        {0,0,1,1},
                        {1,0,1,1}};
        Maze problem = new Maze(maze);
        problem.Solve();
    }
}
