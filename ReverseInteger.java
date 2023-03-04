
public class ReverseInteger {
    public static void main(String[] args)
    {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(ReverseInteger(Integer.MAX_VALUE));
    }
    public static int ReverseInteger(int n)
    {
        int remainder = 0;
        while(n>0)
        {
            remainder = remainder * 10 + n % 10;
            n = n / 10;
        }        
        return remainder;
    }
}
