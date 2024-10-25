import java.util.Scanner;


abstract class Vehicle {
    
    abstract double calculateFuelEfficiency();
}


class Car extends Vehicle {
    private double fuelConsumptionRate; 
    private double distanceTraveled; 

   
    public Car(double distanceTraveled, double fuelConsumptionRate) {
        this.fuelConsumptionRate = fuelConsumptionRate;
        this.distanceTraveled = distanceTraveled;
    }

  
    @Override
    double calculateFuelEfficiency() {
        return distanceTraveled / fuelConsumptionRate; 
    }
}

// Derived class Truck
class Truck extends Vehicle {
    private double fuelConsumptionRate;
    private double distanceTraveled;   

   
    public Truck(double distanceTraveled, double fuelConsumptionRate) {
        this.fuelConsumptionRate = fuelConsumptionRate;
        this.distanceTraveled = distanceTraveled;
    }

   
    @Override
    double calculateFuelEfficiency() {
        return distanceTraveled / fuelConsumptionRate;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
       
        double carDistance = scanner.nextDouble();
       
        double carFuel = scanner.nextDouble();

        
        double truckDistance = scanner.nextDouble();
       
        double truckFuel = scanner.nextDouble();

        Vehicle car = new Car(carDistance, carFuel);
        Vehicle truck = new Truck(truckDistance, truckFuel);
        System.out.printf("Fuel efficiency for Car: %.1f\n", car.calculateFuelEfficiency());
        System.out.printf("Fuel efficiency for Truck: %.1f\n", truck.calculateFuelEfficiency());

        scanner.close();
    }
}
