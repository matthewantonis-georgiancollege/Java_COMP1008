# Mini Exercise 2: 

## Contents: 
- This repository contains code for two classes, Vehicle and Truck, as well as a Runner class for testing the functionality of these classes.

### "Vehicle.java":
- This file contains the Vehicle class.
- The Vehicle class is a base class with instance variables...
  - color
  - numOfDoors
  - gasPowered which
- These describe the vehicle's color, the number of doors, and whether it is gas-powered.
- The class has a default constructor and other constructors that accept different parameters.
- The class also contains getters and setters for the instance variables and a method isEcoFriendly that checks if the vehicle is eco-friendly.

### "Truck.java":
- This file contains the Truck class.
- This extends the Vehicle class and introduces two new instance variables...
  - Seats
  - TrunkSpace
- The seats variable denotes the number of seats, while the trunkSpace denotes the size of the trunk space in the truck.
- The class has a default constructor and other constructors that accept different parameters.
- The class also contains getters and setters for the instance variables and an overridden isEcoFriendly method that includes conditions specific to a truck.

### "Runner.java":
- This file contains the Runner class with the main method for testing the Vehicle and Truck classes.
- The program creates instances of both Vehicle and Truck classes, tests the isEcoFriendly method for these instances, and prints out their string representations.
- It also demonstrates the modification of instance variables.

## How to Run
- Clone this repository to your local machine.
- Open the folder in your Java IDE (Eclipse, IntelliJ, NetBeans, etc.).
- Run the Runner.java file.

## Output: 

<p align="center">
<img width="300" src="https://github.com/matthewantonis-georgiancollege/Java_COMP2003/assets/122380719/8e2569dc-7b8e-41a5-9682-41ed7d073ea9">
<p/> 

### Notes: 
- Created in IntelliJ IDEA (ver. 2023.1.1)

### Assignment Due Date: June 18th, 2023
### Mark Received: 74%
- Feedback Given: Lost marks for submitting it as a zip file
