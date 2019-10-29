import java.util.*;
import java.math.*;

/* https://www.hackerrank.com/challenges/30-operators */

public class Arithmetic
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        double a=mealCost+(mealCost*(double)tipPercent/100)+
                 (mealCost*(double)taxPercent/100);
        System.out.println("The total meal cost is "+Math.round(a)+" dollars.");

        // Print your result
    }
}
