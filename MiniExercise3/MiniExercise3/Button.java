// Interface Button
public interface Button {
    // Total number of buttons
    int BUTTON_COUNT = 2;

    // Default action of a button
    String DEFAULT_ACTION = "Clicked";

    // Action on button press
    String pressButton();

    // Action on button double click
    String doubleClickButton();
}
