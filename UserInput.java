import java.util.Scanner;

/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firstNumber: ");
        int firstValue = sc.nextInt();
        System.out.println("Enter the secondNumber: ");
        int secondValue = sc.nextInt();
        int sum = firstValue + secondValue;
        System.out.println("The sum of two values is: "+sum);
        
        int bigger = (firstValue>secondValue)?firstValue:secondValue;
        System.out.println("The larger value from the two number is: "+ bigger);
     
        
        
        
        
    }
    
}