package org.example.devicemanaging.model;

public class Tablet extends Device {
    private double batteryLife;
    private boolean hasStylus;
    public Tablet() {
        super(DeviceType.TABLET, "", 0.0, 0.0); // Default values
    }

    public Tablet(String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super( DeviceType.TABLET,name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

}