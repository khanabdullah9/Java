import java.util.*;

public class Fibonacci {
    public static void main(String[] args)
    {
        Map<Integer,Integer> table = new HashMap<>();
        table.put(0, 1);
        table.put(1, 1);
        int op = Fibonacci.Tabulation(8, table);
        System.out.println(op);
    }
    public static int Tabulation(int n, Map<Integer, Integer> table)
    {
        for(int i=2;i<=n;++i)
		{
			table.put(i, table.get(i-1)+table.get(i-2));
		}
		return table.get(n);
    }
}
