package org.quangphan.callcenter.demo.parkinglot;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Floor {

    private int level;
    private Set<Slot> availableSlots = new HashSet<>();
    private static final int SIZE = 10;

    public Floor(int level) {
        this.level = level;
        initSlots();
    }

    private void initSlots() {
        for (int i = 0; i < SIZE; i++) {
            if (i % 2 == 0) {
                availableSlots.add(new Slot(i + 1, VehicleSize.Large));
            } else {
                availableSlots.add(new Slot(i + 1, VehicleSize.Small));
            }
        }
    }

    public int getLevel() {
        return level;
    }

    public Optional<List<Slot>> listAvailable(Vehicle vehicle) {
        return Optional.ofNullable(availableSlots.stream()
                .filter(slot -> slot.getSize() == vehicle.getSize())
                .filter(slot -> slot.getVehicle() != null)
                .collect(Collectors.toList()));
    }

    public Optional<Slot> findFirst(Vehicle vehicle) {
        return availableSlots.stream()
                .filter(slot -> slot.getSize() == vehicle.getSize())
                .filter(slot -> slot.getVehicle() != null)
                .findFirst();
    }
}
