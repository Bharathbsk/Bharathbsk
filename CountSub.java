
import java.util.*;
public class CountSub {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String r=sc.next();
        System.out.println(countSub(r));
    }
    static final int MAX_CHAR = 256;
    static int countSub(String str)
    {
        int[] last = new int[MAX_CHAR];
        Arrays.fill(last, -1);
        int n = str.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = 2 * dp[i - 1];
            if (last[(int)str.charAt(i - 1)] != -1)
                dp[i] = dp[i] - dp[last[(int)str.charAt(i - 1)]];
            last[(int)str.charAt(i - 1)] = (i - 1);
        }
        return dp[n]-1;
    }
}