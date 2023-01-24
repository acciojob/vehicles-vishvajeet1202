package com.driver;

public class Boat implements WaterVehicle{

    @Override
    public String getVehicleName(String name) {
        return name;
    }

    @Override
    public int getVehicleCapacity(int capacity) {
        return capacity;
    }
}
