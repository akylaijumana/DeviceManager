
package org.example.devicemanaging;
import org.example.devicemanaging.DeviceType;

public class Device {
    private DeviceType type; // Use DeviceType instead of Enum
    private String name;
    private double price;
    private double weight;

    // Constructor
    public Device(DeviceType type, String name, double price, double weight) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    // Getter for type
    public DeviceType getDeviceType() {
        return type; // Return DeviceType instead of Enum
    }

    // Setter for type
    public void setDeviceType(DeviceType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " (" + type + ") - $" + price + ", Weight: " + weight + "kg";
    }
}
