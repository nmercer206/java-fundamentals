class Car extends MotorVehicle {
    // Car class's constructor is inheriting model and numWheels attributes from the parent MotorVehicle class
    public Car(String model) {
        super(model, 4, 40, 44, "Beep beep!");
    }
    // Abstract methods from parent MotorVehicle class - must be implemented
    public String honk(String vehicleNoise) {
        return "The " + model + " impatiently honked. " + vehicleNoise;
    }

    public int printMeter(int initialFuelLevel){
        return initialFuelLevel;
    }
}