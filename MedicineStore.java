import java.util.Scanner;

/**
 * Write a description of class MedicineStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MedicineStore
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my Medical Shop");
        int stock = 100; // every medicine has 100 stock at beginning
        int price = 1000;
        System.out.println("Enter the name of medicine you want: ");
        String medName = sc.nextLine();
        
        
        
        var result = (stock>0)? "Remaining Stock: "+ --stock: "Not in stock.";
        System.out.println("The price of "+medName+ " is: "+ price);
        System.out.println(result);
        System.out.println("Do you need prescription?(Y/N)");
        String prescription = sc.next();
        var prescp = (prescription == "Y")? "Come to the medical store tomorrow." : "Thank You";
        System.out.println(prescp);
        
        
        
        
        
        
    }
}