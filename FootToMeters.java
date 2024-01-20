/*
 * Jordan Bullard    SDEV 200    9/5/22
 * This program will display a table with feet to meter and meter to feet conversions
 */
public class FootToMeters {
    // Method to convert from feet to meters
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;
    }
    // Method to convert from meters to feet
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }
    public static void main(String[] args){
        // Displaying header
        System.out.println("Feet     Meters     |    Meters     Feet");
        System.out.println("--------------------------------------------");
        // Defining variables
        double feet1 = 1.0;
        double meters2 = 20.0;
        // Loops to go through the methods to display the results
        while (feet1 <= 10) {
            while (meters2 <= 65) {
                System.out.printf(" %-5.1f     %.3f    |    %.1f       %.3f \n", feet1, footToMeter(feet1), meters2, meterToFoot(meters2));
                meters2 = meters2 + 5.0;
                break;
            }
            feet1 = feet1 + 1.0;
        }
    }
}