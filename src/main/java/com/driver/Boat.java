package com.driver;

public class Boat implements WaterVehicle {
    String name;
    int capacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    @Override
    public String getVehicleName() {
        return name;
    }


    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}