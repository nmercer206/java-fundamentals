abstract class MotorVehicle implements Vehicle {

    // attributes are protected, since the Car and Truck children classes are directly inheriting from the MotorVehicle class. Since
    // the attributes are marked as "protected", they can be accessed and modified by members within the same package.
    protected String model;
    protected int numWheels;
    protected int initialFuelLevel;
    protected int maxFuelLevel;
    protected String vehicleNoise;

    // no-args constructor
    public MotorVehicle(){}

    public MotorVehicle(int numWheels, String vehicleNoise) {
    }

    public MotorVehicle(String model, int numWheels, int initialFuelLevel, int maxFuelLevel, String vehicleNoise) {
        this.model = model;
        this.numWheels = numWheels;
        this.initialFuelLevel = initialFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
        this.vehicleNoise = vehicleNoise;
    }

    // these are all inherited from the Vehicle interface. Every vehicle must be able to start, stop, have a setter
    // method for the model, and a getter method for both the model and fuel
    @Override
    public void start() {
        if (initialFuelLevel > 0) {
            System.out.println("Starting the engine of " + model);
        } else {
            refuel();
        }
    }

    @Override
    public void stop() {
        System.out.println("Stopping " + model + "'s engine");
    }

    // getters & setters
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setInitialFuelLevel(int initialFuelLevel) {
        this.initialFuelLevel = initialFuelLevel;
    }

    public void setMaxFuelLevel(int maxFuelLevel) {
        this.maxFuelLevel = maxFuelLevel;
    }

    public String getVehicleNoise() {
        return vehicleNoise;
    }

    public void setVehicleNoise(String vehicleNoise) {
        this.vehicleNoise = vehicleNoise;
    }

    public int getInitialFuelLevel() {
        return initialFuelLevel;
    }

    public int getMaxFuelLevel(){
        return maxFuelLevel;
    }

    // concrete methods - child classes don't need to inherit these
    public void refuel() {
        initialFuelLevel = getMaxFuelLevel();
        System.out.println("Refueling complete." + " Fuel level is now at " + getMaxFuelLevel() + " gallons.");
    }

    // instance of overloaded method. Same method name as above, but with additional parameters
    public String refuel(int initialFuelLevel, int maxFuelLevel){
        int diffFuelLevel = 0;
        if (initialFuelLevel < maxFuelLevel){
            diffFuelLevel = maxFuelLevel - initialFuelLevel;
        }
        this.initialFuelLevel = maxFuelLevel;
        return diffFuelLevel + " gallons was added to the tank! - MotorVehicle";
    }

    // abstract methods - every method below must be implemented in child classes
    public abstract String honk(String vehicleNoise);
    public abstract int printMeter(int initialFuelLevel);

}