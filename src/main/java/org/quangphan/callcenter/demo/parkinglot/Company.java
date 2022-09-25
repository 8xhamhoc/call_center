package org.quangphan.callcenter.demo.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

}
