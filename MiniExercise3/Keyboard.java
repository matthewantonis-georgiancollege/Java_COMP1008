// Abstract Class Keyboard
public abstract class Keyboard {
    // Keyboard model and manufacturer
    protected String model;
    protected String manufacturer;

    // Getter for model
    public String getModel() {
        return this.model;
    }

    // Getter for manufacturer
    public String getManufacturer() {
        return this.manufacturer;
    }

    // Check if keyboard is wireless
    public abstract boolean isWireless();
}
