import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = sc.nextInt();
        int sum;
        sum = num1 + num2;
        int substract = num1 - num2;
        double div = (double)num1 /num2;
        int prod = num1 * num2;
        int mod = num1%num2;
        System.out.println("The sum of "+ num1 + " and " + num2 + " is: " + sum);
        System.out.println("The difference of "+ num1 + " and " + num2 + " is: " + substract);
        System.out.println("The prodcut of "+ num1 + " and " + num2 + " is: " + prod);
        System.out.println("The divison of "+ num1 + " and " + num2 + " is: " + div);
        System.out.println("The remainder of "+ num1 + " and " + num2 + " is: " + mod);
    }
}