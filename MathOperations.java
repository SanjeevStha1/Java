import java.util.Scanner;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        if (num1==num2){
            System.out.println(num1 + " and " + num2 + " are equal.");
        }
        else{
            System.out.println(num1 + " and " + num2 + " are not equal.");
            if (num1>num2){
            System.out.println(num1+" is the bigger number.");
        }
        else{
            System.out.println(num2+" is the bigger number.");
        }
        }
    }
}