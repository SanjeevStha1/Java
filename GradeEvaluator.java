import java.util.Scanner;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int grade = sc.nextInt();
        String result = (grade>=40)? "pass":"fail";
        System.out.println(result);
        
    }
}