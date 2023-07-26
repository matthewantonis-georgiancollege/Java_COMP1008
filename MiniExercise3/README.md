# Mini Exercise 3: 

## Contents: 
- This repository contains code for two interfaces, Button and Keyboard, and a concrete class, Computer, which extends the Keyboard interface and implements the Button interface.

### "Button.java":
- This file defines an interface Button.
- The Button interface includes...
  - "Constant BUTTON_COUNT" representing the total number of buttons
  - "DEFAULT_ACTION" string indicating the default action of a button
  - Two abstract methods:
    - pressButton
    - doubleClickButton
  - Representing the actions when a button is pressed and double-clicked, respectively.

### "Keyboard.java":
- This file contains the abstract class Keyboard.
- This class includes two protected instance variables...
  - Model
  - Manufacturer
- Representing the model and the manufacturer of the keyboard. It also includes getters for these variables, and an abstract method isWireless, which checks if the keyboard is wireless.

### "Computer.java":
- This file contains the Runner class with the main method for testing the Vehicle and Truck classes.
- The program creates instances of both Vehicle and Truck classes, tests the isEcoFriendly method for these instances, and prints out their string representations.
- It also demonstrates the modification of instance variables.

## How to Run
- Clone this repository to your local machine.
- Open the folder in your Java IDE (Eclipse, IntelliJ, NetBeans, etc.).
- You will need to create a main method to run.
  - It was not necessary when submitting this assignment. 

### Notes: 
- Created in IntelliJ IDEA (ver. 2023.1.1)

### Assignment Due Date: July 16th, 2023
### Mark Received: ???
