package org.example.devicemanaging.model;

public class Smartphone extends Device {
    private double screenSize;
    private double cameraResolution;

    public Smartphone() {
        super(DeviceType.SMARTPHONE, "", 0.0, 0.0); // Default values
    }

    public Smartphone(String name, double price, double weight, double screenSize, double cameraResolution) {
        super(DeviceType.SMARTPHONE, name,price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    public double getScreenSize() {

        return screenSize;
    }

    public void setScreenSize(double screenSize) {

        this.screenSize = screenSize;
    }

    public double getCameraResolution() {

        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {

        this.cameraResolution = cameraResolution;
    }
}