
/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[]arg)
    {
        int waterLevel;
        waterLevel = 1000;
        System.out.println("The current water level is: " + waterLevel +"litres.");
        String result = (waterLevel >=1000)? "WARNING! Water Level has reached 1000l" : "Status:Normal";
        System.out.println(result);
    }
}