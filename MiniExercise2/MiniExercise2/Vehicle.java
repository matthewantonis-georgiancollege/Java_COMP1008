package MiniExercise2;

public class Vehicle {
    // Instance variables with different accessibility levels
    String color; // default (no modifier): also known as package-private.
    protected int numOfDoors; // accessible within this class and subclasses
    public boolean gasPowered; // accessible from any class

    // Default constructor
    public Vehicle() {
    }

    // Constructor with color parameter
    public Vehicle(String color) {
        this.color = color;
    }

    // Constructor with color and numOfDoors parameters
    public Vehicle(String color, int numOfDoors) {
        this.color = color;
        this.numOfDoors = numOfDoors;
    }

    // Constructor with color, numOfDoors, and gasPowered parameters
    public Vehicle(String color, int numOfDoors, boolean gasPowered) {
        this.color = color;
        this.numOfDoors = numOfDoors;
        this.gasPowered = gasPowered;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for numOfDoors
    public int getNumOfDoors() {
        return numOfDoors;
    }

    // Setter for numOfDoors
    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    // Getter for gasPowered
    public boolean isGasPowered() {
        return gasPowered;
    }

    // Setter for gasPowered
    public void setGasPowered(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }

    // Method to check if the vehicle is eco-friendly (not gas powered and has two doors)
    public boolean isEcoFriendly() {
        return numOfDoors == 2 && !gasPowered;
    }

    // Overridden toString method to return a string representation of the vehicle
    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", numOfDoors=" + numOfDoors +
                ", gasPowered=" + gasPowered +
                '}';
    }
}
