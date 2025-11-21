import java.util.Scanner;

/**
 * Write a description of class DayConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DayConverter
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days = sc.nextInt();
        int years = days/365;
        int remainder = days%365;
        int months = remainder/30;
        int remainder2 = remainder%30;
        int remainingdays = remainder2;
        System.out.println(years+" years "+ months +" months "+remainingdays +" days.");
        
    }
}