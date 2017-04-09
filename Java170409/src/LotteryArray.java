/**
 * Created by Administrator on 2017/4/9.
 */

/**
 * This program demonstrates a triangular array.
 *
 */
public class LotteryArray {
    public static void main(String[] args)
    {
        final int NMAX = 10;

        //allocate triangular array

        int[][] odds = new int[NMAX + 1][];
        for(int n = 0;n <= NMAX;n++)
        {
            odds[n] = new int[n + 1];
        }

        //fill triangular array

        for(int k = 0;k < odds.length; k++)
        {
            int lotteryOdds = 1;
            for(int i = 1; i <= k; i++ )
            {
                lotteryOdds = lotteryOdds * (n - i)
            }
        }
    }
}
