class Truck extends MotorVehicle {
    private boolean isDiesel;

    private boolean hasCargo;

    public Truck(int numWheels, String vehicleNoise, boolean hasCargo){
        super(numWheels, vehicleNoise);
        this.hasCargo = hasCargo;
    }
    // Truck class's constructor is inheriting model and numWheels attributes from the parent MotorVehicle class
    public Truck(String model, boolean hasCargo, boolean isDiesel) {
        super(model, 6, 14, 22, "Honk honk!");
        this.hasCargo = hasCargo;
        this.isDiesel = isDiesel;
    }

    // getters & setters
    public boolean getHasCargo(){
        return hasCargo;
    }
    public void setCargo(boolean hasCargo){
        this.hasCargo = hasCargo;
    }

    public boolean getIsDiesel(){
        return isDiesel;
    }

    public void setIsDiesel(boolean isDiesel){
        this.isDiesel = isDiesel;
    }

    public String shouldRefuel(boolean hasCargo , boolean isDiesel){
        if (hasCargo && isDiesel){
            return "This truck is primed and more than than capable of delivering cargo!";
        } else if (hasCargo || isDiesel){
            return "This truck is capable of efficiency hauling cargo.";
        }
        return "This truck is capable of hauling cargo, but inefficiently so.";
    }

    // Abstract methods from parent MotorVehicle class - must be implemented
    public String honk(String vehicleNoise){
        return "The " + model + " impatiently honked! " + vehicleNoise;
    }
    public int printMeter(int initialFuelLevel){
        return initialFuelLevel;
    }

    // Overloaded method, for trucks who reasonably honk
    public String honk() {
        if (hasCargo) {
            return "The " + model + " honked loudly! " + vehicleNoise;
        } else {
            return "The " + model + " honked softly. " + vehicleNoise;
        }
    }

}