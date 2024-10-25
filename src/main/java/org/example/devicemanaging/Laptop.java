package org.example.devicemanaging;

public class Laptop extends Device {
    private int ramSize;
    private String processorType;
    public Laptop() {
        super(DeviceType.LAPTOP, "", 0.0, 0.0); // Default values
    }

    public Laptop(String name, double price, double weight, int ramSize, String processorType) {
        super(DeviceType.LAPTOP,name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
}