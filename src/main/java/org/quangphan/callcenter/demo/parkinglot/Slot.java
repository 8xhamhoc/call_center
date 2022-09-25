package org.quangphan.callcenter.demo.parkinglot;

public class Slot {

    private int number;
    private VehicleSize size;
    private Vehicle vehicle;

    public Slot(int number, VehicleSize size) {
        this.number = number;
        this.size = size;
    }

    public VehicleSize getSize() {
        return size;
    }

    public int getNumber() {
        return number;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            throw new VehicleAlreadyParkException();
        }

        if (vehicle.getSize() != size) {
            throw new InvalidVehicleSizeException();
        }

        this.vehicle = vehicle;
    }

    public void leaveVehicle() {
        vehicle = null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
