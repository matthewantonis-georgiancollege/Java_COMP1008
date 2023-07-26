public class House {

    // Declare public property 'color'
    public String color;

    // Declare private property 'rooms'
    private int rooms;

    // Declare protected property 'size'
    protected double size;

    // Default constructor
    public House() {}

    // Constructor that takes color as argument
    public House(String color) {
        this.color = color;
    }

    // Constructor that takes color and rooms as arguments
    public House(String color, int rooms) {
        this.color = color;
        this.rooms = rooms;
    }

    // Constructor that takes color, rooms and size as arguments
    public House(String color, int rooms, double size) {
        this.color = color;
        this.rooms = rooms;
        this.size = size;
    }

    // Constructor that takes rooms as argument
    public House(int rooms) {
        this.rooms = rooms;
    }

    // Constructor that takes size as argument
    public House(double size) {
        this.size = size;
    }

    // Constructor that takes rooms and size as arguments
    public House(int rooms, double size) {
        this.rooms = rooms;
        this.size = size;
    }

    // Getter method for rooms property
    public int getRooms() {
        // Returns the value of rooms property
        return rooms;
    }
}
