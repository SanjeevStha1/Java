
import java.util.Scanner;

/**
 * Write a description of class FareCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FareCalculator
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int baseFare = 20;
        int perKmCharge = 10;
        int perMinCharge = 1;
        int localDiscountPercentage = 20; //applicable if distance > 10km.
        int nightExtraChargePercentage = 10;
        System.out.print("How much was distance of trip? ");
        double distance = sc.nextDouble();
        System.out.print("How long was the trip in minutes? ");
        double time = sc.nextDouble();
        System.out.print("Are you local? ");
        boolean isLocal  = sc.nextBoolean();
        
    }
}