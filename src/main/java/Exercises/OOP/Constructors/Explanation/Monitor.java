package main.java.Exercises.OOP.Constructors.Explanation;

public class Monitor {
    private String model;
    private String manufacturer;
    private int screenSize;
    private Resolution nativeResolution; // Resolution - bus klasė. Ją sukūrus "Resolution" taps Composition.

    public Monitor(String model, String manufacturer, int screenSize, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.nativeResolution = nativeResolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawin pixel at " + x + ", " + y + " in color " + color);

    }
}
