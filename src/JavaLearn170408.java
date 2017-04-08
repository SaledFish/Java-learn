/**
 * Created by Administrator on 2017/4/8.
 */

import java.util.*;

public class JavaLearn170408 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retire?");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while(balance < goal)
        {
            //add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in " + years + " years");
    }
}
