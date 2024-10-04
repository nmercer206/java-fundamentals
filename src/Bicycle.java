class Bicycle implements Vehicle {

    // attributes are marked as "private", since the Bicycle class isn't inheriting from any parent class.
    private String model;
    private int gear;

    public Bicycle(String model) {
        this.model = model;
        this.gear = 1; // initial gear is always set to 1
    }

    // implemented methods from Vehicle interface
    @Override
    public void start() {
        System.out.println("Pedaling...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...*SCREEECH*");
    }

    @Override
    public void refuel() {
        System.out.println("Inflating tires...");
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

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}