package MiniExercise2;

public class Runner {

    public static void main(String[] args) {

        // Creating and testing a Vehicle
        Vehicle myVehicle = new Vehicle("Blue", 4, true);
        System.out.println(myVehicle.toString());
        System.out.println("Is my vehicle eco-friendly? " + myVehicle.isEcoFriendly());

        // Creating and testing a Truck
        Truck myTruck = new Truck("Red", 2, false, 2, 500.0);
        System.out.println(myTruck.toString());
        System.out.println("Is my truck eco-friendly? " + myTruck.isEcoFriendly());

        // Creating and testing an eco-friendly Truck
        Truck ecoFriendlyTruck = new Truck("Green", 2, false, 2, 0.0);
        System.out.println(ecoFriendlyTruck.toString());
        System.out.println("Is my truck eco-friendly? " + ecoFriendlyTruck.isEcoFriendly());
        
        // Modifying attributes
        myTruck.setColor("Black");
        myTruck.setNumOfDoors(3);
        myTruck.setGasPowered(true);
        myTruck.setSeats(3);
        myTruck.setTrunkSpace(0);

        // Checking the updated Truck
        System.out.println(myTruck.toString());
        System.out.println("Is my updated truck eco-friendly? " + myTruck.isEcoFriendly());
    }
}
