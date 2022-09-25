package org.quangphan.callcenter.demo.parkinglot;

public class Vehicle {

    private String numberPlate;
    private VehicleSize size = VehicleSize.Large;
    private Slot slot;

    public Vehicle(String name, VehicleSize size) {
        this.numberPlate = name;
        this.size = size;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void parkToSlot(Slot slot) {
        this.slot = slot;
        slot.parkVehicle(this);
    }
}
