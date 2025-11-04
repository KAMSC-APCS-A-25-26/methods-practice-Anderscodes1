import java.text.DecimalFormat;
import java.util.Scanner;

public class TripPlanner {
    static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Get user input for trip details

        // - Distance (miles)
        System.out.print("Enter trip distance (miles): ");
        int distance = sc.nextInt();

        // - Average speed (mph)
        System.out.print("Enter average speed (mph): ");
        int speed = sc.nextInt();

        // - Fuel efficiency (miles per gallon)
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        int mpg = sc.nextInt();

        // - Fuel price per gallon
        System.out.print("Enter fuel price per gallon ($): ");
        double fPrice = sc.nextDouble();
        
        // TODO: Calculate travel time using a return method
        double travelTime = calculateTravelTime(distance, speed);

        // TODO: Calculate fuel needed using a return method
        double fuelNeeded = calculateFuelNeeded(distance, mpg);

        // TODO: Calculate trip cost using a return method
        double tripCost = calculateTripCost(fuelNeeded, fPrice);
        // TODO: Display results using a void method
        displayResults(travelTime, fuelNeeded, tripCost);
    }


    
    // TODO: Implement calculateTravelTime method
    public static double calculateTravelTime(int a, int b) {
        return (double) a/(double) b;
    }

    // TODO: Implement calculateFuelNeeded method
    public static double calculateFuelNeeded(int a, int b) {
        return (double) a/(double) b;
    }
    // TODO: Implement calculateTripCost method
    public static double calculateTripCost(double a, double b) {
        return a*b;
    }
    // TODO: Implement displayResults method
    public static void displayResults(double a, double b, double c) {
        System.out.println("\nResults:");
        System.out.println("Travel Time: " + df.format(a) + " hours");
        System.out.println("Fuel Needed: " + df.format(b) + " gallons");
        System.out.println("Trip Cost: $" + df.format(c));
    }
}
