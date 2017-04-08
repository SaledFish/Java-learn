/**
 * Created by Administrator on 2017/4/8.
 */
import java.math.*;
import java.util.*;
public class JavaLearn170408 {
    /*BigInteger Teat*/
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers you to draw?");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw?");
        int n = in.nextInt();

        BigInteger lottery0dds = BigInteger.valueOf(1);

        for(int i = 1;i <= k;i++)
        {
            lottery0dds = lottery0dds.multiply(BigInteger.valueOf(n - i + 1)).divide(
                    BigInteger.valueOf(i));


            System.out.println("Your odds are 1 in " + lottery0dds + ". Good Luck!");
        }
    }

}
