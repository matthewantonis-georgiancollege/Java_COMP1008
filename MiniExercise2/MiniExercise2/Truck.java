package MiniExercise2;

// Truck class that extends the Vehicle class
public class Truck extends Vehicle {
    // Additional instance variables unique to a Truck
    protected int seats; // accessible within this class and subclasses
    public double trunkSpace; // accessible from any class

    // Default constructor
    public Truck() {
    }

    // Constructor with color parameter
    public Truck(String color) {
        super(color);
    }

    // Constructor with color and numOfDoors parameters
    public Truck(String color, int numOfDoors) {
        super(color, numOfDoors);
    }

    // Constructor with color, numOfDoors, and gasPowered parameters
    public Truck(String color, int numOfDoors, boolean gasPowered) {
        super(color, numOfDoors, gasPowered);
    }

    // Constructor with all Vehicle's instance variables and seats parameter
    public Truck(String color, int numOfDoors, boolean gasPowered, int seats) {
        super(color, numOfDoors, gasPowered);
        this.seats = seats;
    }

    // Constructor with all Vehicle's instance variables and trunkSpace parameter
    public Truck(String color, int numOfDoors, boolean gasPowered, double trunkSpace) {
        super(color, numOfDoors, gasPowered);
        this.trunkSpace = trunkSpace;
    }

    // Constructor with all Vehicle's and Truck's instance variables
    public Truck(String color, int numOfDoors, boolean gasPowered, int seats, double trunkSpace) {
        super(color, numOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    // Getter for seats
    public int getSeats() {
        return seats;
    }

    // Setter for seats
    public void setSeats(int seats) {
        this.seats = seats;
    }

    // Getter for trunkSpace
    public double getTrunkSpace() {
        return trunkSpace;
    }

    // Setter for trunkSpace
    public void setTrunkSpace(double trunkSpace) {
        this.trunkSpace = trunkSpace;
    }

    // Override the isEcoFriendly method to include conditions specific to Truck
    @Override
    public boolean isEcoFriendly() {
        return super.isEcoFriendly() && seats <= 2 && trunkSpace == 0;
    }

    // Overridden toString method to return a string representation of the truck
    @Override
    public String toString() {
        return "Truck{" +
                "seats=" + seats +
                ", trunkSpace=" + trunkSpace +
                ", color='" + color + '\'' +
                ", numOfDoors=" + numOfDoors +
                ", gasPowered=" + gasPowered +
                '}';
    }
}