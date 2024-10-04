public class Main {
    public static void main(String[] args) {
        // Create instances of Car, Truck, and Bicycle class
        Car car = new Car("Toyota Camry");
        Truck truck = new Truck("Ford F-150", true, true);
        Bicycle bike = new Bicycle("Mountain Bike");

        // Demonstrate methods for each vehicle
        System.out.println("Car:");
        demonstrateVehicleMethods(car);

        System.out.println("\nTruck:");
        demonstrateVehicleMethods(truck);

        System.out.println("\nBicycle:");
        demonstrateVehicleMethods(bike);
    }
    private static void demonstrateVehicleMethods(Vehicle vehicle) {
        System.out.println("Model: " + vehicle.getModel());
        vehicle.start();
        vehicle.stop();

        if (vehicle instanceof MotorVehicle) {
            MotorVehicle motorVehicle = (MotorVehicle) vehicle;
            System.out.println("Number of wheels: " + motorVehicle.getNumWheels());
            motorVehicle.refuel();
            System.out.println("Initial Fuel Level: " + motorVehicle.getInitialFuelLevel());
            motorVehicle.honk(motorVehicle.getVehicleNoise());
            System.out.println(motorVehicle.printMeter(motorVehicle.getInitialFuelLevel()));
        }
    }
}