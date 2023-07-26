// Class HouseRunner which contains the main method to execute the program
public class HouseRunner {
    // Main method
    public static void main(String[] args) {
        // Create a new instance of House with color
        House house1 = new House("Blue");

        // Create a new instance of House with color and rooms
        House house2 = new House("Red", 2);

        // Create a new instance of House with color, rooms and size in square feet
        House house3 = new House("Green", 3, 131.25);

        // Print the color of house1
        System.out.printf("House1: Color: %s%n", house1.color);

        // Print the color and number of rooms of house2
        System.out.printf("House2: Color: %s, Rooms: %d%n", house2.color, house2.getRooms());

        // Print the color, number of rooms and size of house3
        System.out.printf("House3: Color: %s, Rooms: %d, Size: %.2f square feet%n", house3.color,  house3.getRooms(), house3.size);
    }
}