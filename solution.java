import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int distance;
        double taxi_fare = 10, taxi_tariff = 2.2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Distance(km): ");
        distance = input.nextInt();
        
        taxi_fare += taxi_tariff*distance;
        
        taxi_fare = taxi_fare < 20 ? 20 : taxi_fare;
        
        System.out.printf("Taxi Fare: %.2f", taxi_fare);
       
    }
}
