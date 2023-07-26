// Concrete Class Computer
public class Computer extends Keyboard implements Button {
    // Indicates if the computer is wireless
    private boolean wireless;

    // Computer constructor
    public Computer(String model, String manufacturer, boolean wireless) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.wireless = wireless;
    }

    // Button press action
    @Override
    public String pressButton() {
        return "Button has been pressed once!";
    }

    // Double button click action
    @Override
    public String doubleClickButton() {
        return "Button has been double-clicked!";
    }

    // Checks if computer is wireless
    @Override
    public boolean isWireless() {
        return this.wireless;
    }
}


